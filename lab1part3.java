/* This program is a Simple-Substitution decrypter that takes in two arguments, 
   an encrypted message and a key in the form of a modified alphabet.
   This program returns the plain-text phrase.
*/

import java.util.Scanner;

public class lab1part3{

    public static void decryptMessage(String encryptedMessage, String modifiedAlphabet)
    {  
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder tempString = new StringBuilder(encryptedMessage);

        //System.out.println(plainText.length());
        for (int i = 0; i < encryptedMessage.length(); i++)
        {
            char temp = encryptedMessage.charAt(i); //get the plainText letters at each i
            if(alphabet.contains(Character.toString(temp)))
            {
                int alphabetindex = modifiedAlphabet.indexOf(temp);
                tempString.setCharAt(i, alphabet.charAt(alphabetindex));
            }
            else
            {
                tempString.setCharAt(i, ' ');
            }
            
        }
        System.out.println(tempString);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String alphabet =         "abcdefghijklmnopqrstuvwxyz";
        String modifiedAlphabet = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("Which one do you want to decrypt? 1 - 3");
        int input = scan.nextInt();

        switch (input) {
            case 1:
                 String encryptedMessage = "sv dsl urtsgh drgs nlmhgvih hslfow ollp gl rg gszg sv srnhvou wlvh mlg yvxlnv z nlmhgvi zmw ru blf tzav olmt rmgl zm zybhh gsv zybhh zohl tzavh rmgl blf"; 
                 decryptMessage(encryptedMessage, modifiedAlphabet);
                 break;
 
            case 2:
                 String encryptedMessage2 = "gsviv rh z gsvlib dsrxs hgzgvh gszg ru vevi zmbylwb wrhxlevih vczxgob dszg gsv fmrevihv rh uli zmw dsb rg rh sviv rg droo rmhgzmgob wrhzkkvzi zmw yv ivkozxvw yb hlnvgsrmt vevm nliv yraziiv zmw rmvckorxzyov gsviv rh zmlgsvi gsvlib dsrxs hgzgvh gszg gsrh szh zoivzwb szkkvmvw";
                 decryptMessage(encryptedMessage2, modifiedAlphabet);
                  break;
 
            case 3:
                String encryptedMessage3 = "dsvmvevi r urmw nbhvou tildrmt tirn zylfg gsv nlfgs dsvmvevi rg rh z wznk wiraaob mlevnyvi rm nb hlfo dsvmvevi r urmw nbhvou rmelofmgzirob kzfhrmt yvuliv xluurm dzivslfhvh zmw yirmtrmt fk gsv ivzi lu vevib ufmvizo r nvvg zmw vhkvxrzoob dsvmvevi nb sbklh tvg hfxs zm fkkvi szmw lu nv gszg rg ivjfrivh z hgilmt nlizo kirmxrkov gl kivevmg nv uiln wvoryvizgvob hgvkkrmt rmgl gsv hgivvg zmw nvgslwrxzoob pmlxprmt kvlkov  h szgh luu  gsvm  r zxxlfmg rg srts grnv gl tvg gl hvz zh hllm zh r xzm";
                decryptMessage(encryptedMessage3, modifiedAlphabet);
                break;
            
          
            default:
                System.out.println("Wrong input please try again");
                break;
        }

     scan.close();
    }
}
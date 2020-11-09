/* 
   This program is a Simple-Substitution decrypter that takes in two arguments, 
   an encrypted message and a key in the form of a modified alphabet.
   This program returns the plain-text phrase.
*/

import java.util.Scanner;

public class lab1part3{

     /*
        Function takes in a string of the text we want to decode and our modified alphabet in a string form. 
        Then performs the task of decoding message and prints out decoded message. 
    */
    public static void decryptMessage(String encryptedMessage, String modifiedAlphabet)
    {  
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; //regular alphabet
        StringBuilder tempString = new StringBuilder(encryptedMessage); //new stringbuilder with encrypted message for easy text manipulation

        //System.out.println(plainText.length()); <- test code 
        for (int i = 0; i < encryptedMessage.length(); i++) //iterating through the encrypted message 
        {
            char temp = encryptedMessage.charAt(i); //get the plainText letters at each i
            if(alphabet.contains(Character.toString(temp))) //if the character of the encrypted message at index i is in the alphabet 
            {
                int alphabetindex = modifiedAlphabet.indexOf(temp); //get that index from the modified alphabet of the letter
                tempString.setCharAt(i, alphabet.charAt(alphabetindex)); // add letter to the stringbuilder
            }
            else //use in case char at index i is NOT a letter, like a space 
            {
                tempString.setCharAt(i, ' '); // add a space to the stringbuilder
            }
            
        }
        System.out.println(tempString); //at the end print the stringbuilder
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //scanner to take input
        String modifiedAlphabet = "zyxwvutsrqponmlkjihgfedcba"; //modified alphabet we use for decode
        System.out.println("Which one do you want to decrypt? 1 - 3"); 
        int input = scan.nextInt(); //get input from scanner.

        switch (input) { //switch statement to handle the different problems in prompt
            case 1: //problem 1 to decode
                 String encryptedMessage = "sv dsl urtsgh drgs nlmhgvih hslfow ollp gl rg gszg sv srnhvou wlvh mlg yvxlnv z nlmhgvi zmw ru blf tzav olmt rmgl zm zybhh gsv zybhh zohl tzavh rmgl blf"; 
                 decryptMessage(encryptedMessage, modifiedAlphabet); //calls method with encryptedmessage and modified alphabet as parameters
                 break;
 
            case 2: //problem 2 to decode
                 String encryptedMessage2 = "gsviv rh z gsvlib dsrxs hgzgvh gszg ru vevi zmbylwb wrhxlevih vczxgob dszg gsv fmrevihv rh uli zmw dsb rg rh sviv rg droo rmhgzmgob wrhzkkvzi zmw yv ivkozxvw yb hlnvgsrmt vevm nliv yraziiv zmw rmvckorxzyov gsviv rh zmlgsvi gsvlib dsrxs hgzgvh gszg gsrh szh zoivzwb szkkvmvw";
                 decryptMessage(encryptedMessage2, modifiedAlphabet);
                  break;
 
            case 3: //problem 3 to decode
                String encryptedMessage3 = "dsvmvevi r urmw nbhvou tildrmt tirn zylfg gsv nlfgs dsvmvevi rg rh z wznk wiraaob mlevnyvi rm nb hlfo dsvmvevi r urmw nbhvou rmelofmgzirob kzfhrmt yvuliv xluurm dzivslfhvh zmw yirmtrmt fk gsv ivzi lu vevib ufmvizo r nvvg zmw vhkvxrzoob dsvmvevi nb sbklh tvg hfxs zm fkkvi szmw lu nv gszg rg ivjfrivh z hgilmt nlizo kirmxrkov gl kivevmg nv uiln wvoryvizgvob hgvkkrmt rmgl gsv hgivvg zmw nvgslwrxzoob pmlxprmt kvlkov  h szgh luu  gsvm  r zxxlfmg rg srts grnv gl tvg gl hvz zh hllm zh r xzm";
                decryptMessage(encryptedMessage3, modifiedAlphabet);
                break;
            
          
            default: //default message to print in case of not valid input (not #1-3)
                System.out.println("Wrong input please try again");
                break;
        }

     scan.close(); //close to prevent mem leaks
    }
}
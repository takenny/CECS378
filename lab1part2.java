/* 
   This program is a Simple-Substitution encrypter that takes in two arguments, 
   an existing plain-text phrase and a key in the form of a modified alphabet.
   This program returns the encrypted message.
*/

import java.util.Scanner;

public class lab1part2 {
    /*
    iterate through each letter of plain text then check if that letter is in the alphabet and if it is, find the index of it is in alphabet 
    then take that index adn look at wghat letter is in the modified alphabet and then replace the letter in the plaintext with the letter of 
    the index of the modified alphabet. 
    */
    public static void encode(String plainText, String modifiedAlphabet)
    {   
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder tempString = new StringBuilder(plainText); 

        for (int i = 0; i < plainText.length(); i++)
        {
            char temp = plainText.charAt(i); //get the plainText letters at each i
            if(alphabet.contains(Character.toString(temp)))
            {
                int alphabetindex = alphabet.indexOf(temp);
                tempString.setCharAt(i, modifiedAlphabet.charAt(alphabetindex));
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
        String modifiedAlphabet = "zyxwvutsrqponmlkjihgfedcba"; 

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell me what you want to encrypt. 1 - 3");
        int input = scan.nextInt();

        switch (input) {
            case 1:
                String plainText = "He who fights with monsters should look to it that he himself does not become a monster. And if you gaze long into an abyss, the abyss also gazes into you.";
                encode(plainText.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet); 
                break;
 
            case 2:
                String plainText2 = "There is a theory which states that if ever anybody discovers exactly what the Universe is for and why it is here, it will instantly disappear and be replaced by something even more bizarre and inexplicable. There is another theory which states that this has already happened.";
                encode(plainText2.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet);
            break;
 
            case 3:
                String plainText3 = "Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people ’s hats off - then , I account it high time to get to sea as soon as I can.";
                encode(plainText3.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet);
                break;
 
            default:
                System.out.println("Wrong input please try again");
                break;
 
        }

        scan.close();
    }
}
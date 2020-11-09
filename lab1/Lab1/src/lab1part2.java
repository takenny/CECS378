/* 
   This program is a Simple-Substitution encrypter that takes in two arguments, 
   an existing plain-text phrase and a key in the form of a modified alphabet.
   This program returns the encrypted message.
*/

import java.util.Scanner;

public class lab1part2 {

    /*
        Function takes in a string of the text we want to encode and our modified alphabet in a string form. 
        Then performs the task of encoding message and prints out encoded message. 
    */
    public static void encode(String plainText, String modifiedAlphabet)
    {   
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; //regular alphabet 
        StringBuilder tempString = new StringBuilder(plainText);  //originially i wanted to replace the string elements using java replace() but that did not work
        //took me a couple of hours to figure it out and i used this method of creating a stringbuilder and that fixed the issue

        for (int i = 0; i < plainText.length(); i++) //for loop to interate through the plainText we want to encode 
        {
            char temp = plainText.charAt(i); //get the plainText letters at each i 
            if(alphabet.contains(Character.toString(temp))) //if the character is in the alphabet
            {
                int alphabetindex = alphabet.indexOf(temp); //get the index and then put the char at the modified alphabet index into our string builder
                tempString.setCharAt(i, modifiedAlphabet.charAt(alphabetindex));
            }
            else //catches if character is NOT in the alphabet like a space 
            {
                tempString.setCharAt(i, ' ');
            }
            
        }
        System.out.println(tempString); //prints out encoded message. 
    }

    public static void main(String[] args)
    {   
        String modifiedAlphabet = "zyxwvutsrqponmlkjihgfedcba"; //modified alphabet key 
 
        Scanner scan = new Scanner(System.in); //scanner to take in input 
        System.out.println("Please tell me what you want to encrypt. 1 - 3");
        int input = scan.nextInt(); //input of scanner's next integer 

        switch (input) { //switch statement to handle different cases of the prompt.
            case 1: //problem 1 of part 2
                String plainText = "He who fights with monsters should look to it that he himself does not become a monster. And if you gaze long into an abyss, the abyss also gazes into you.";
                encode(plainText.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet); //calls method encode to lowercase so the ascii/ char values wont generate null pointer exception and uses replace all to get the plain text without punctuation marks
                break;
 
            case 2: //problem 2
                String plainText2 = "There is a theory which states that if ever anybody discovers exactly what the Universe is for and why it is here, it will instantly disappear and be replaced by something even more bizarre and inexplicable. There is another theory which states that this has already happened.";
                encode(plainText2.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet);
            break;
 
            case 3: //problem 3
                String plainText3 = "Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people ’s hats off - then , I account it high time to get to sea as soon as I can.";
                encode(plainText3.toLowerCase().replaceAll("\\p{Punct}", ""), modifiedAlphabet);
                break;
 
            default: //default to handle invalid inputs
                System.out.println("Wrong input please try again");
                break;
 
        }

        scan.close(); //closes scanner to prevent mem leaks
    }
}
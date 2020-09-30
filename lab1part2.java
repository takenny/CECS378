/* This program is a Simple-Substitution encrypter that takes in two arguments, 
   an existing plain-text phrase and a key in the form of a modified alphabet.
   This program returns the encrypted message.
*/

import java.util.Scanner;

public class lab1part2 {

    /* 
    Returns the key to increment the alphabet by doing calculations
    */
    public int getKey(String alphabet)
    {
        int key = 0;

        return key; 
    }

    /*
    Returns the modded alphabet from 
    */
    public String encryptHelper(String alphabet, int key)
    {
        String modAlphabet = "";

        return modAlphabet;
    }

    public String encrypt(String plainText, String modifiedAlphabet)
    {
        String encryptedMessage = encrpyptHelper(plainText, getKey(modifiedAlphabet));
        return encryptMessage;
    }

    public static void main(String[] args)
    {   
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int alphabetKey = getKey(alphabet);
        Scanner scan = new Scanner();
        System.out.println("Please tell me what you want to encrypt.");
        String plainText = scan.next();

        scan.close();
    }
}
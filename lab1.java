/* 
   This program is a decrypter that takes in an argument, 
   an existing plain-text phrase and returns encrypted messages.
*/
import java.util.Scanner;


public class lab1 {

    /*
    * This method takes in a msg String and prints out the decoded msg.
    */
   
   public static void decode(String msg) {
       char[] encodedArray = msg.toCharArray(); //puts msg from parameter to a char array 
       char[] decodeArray = new char[encodedArray.length]; //made a new char array to input the decoded msg.
       int intChar; //used to get integer value of character and store it
       int a = 97; //ascii of 'a' value 

       for (int i = 0; i < 26; i++) // iterating through the alphabet 
       {
           for (int k = 0; k < encodedArray.length; k++) // iterating through the charArray
           {

               if (encodedArray[k] != ' ') {   //if the element in index k is not a space 
                    intChar = encodedArray[k];  //store the value of the element 
                    intChar = (intChar - a + i) % 26 + a;  //use this formula to figure out the correct decoded msg from the element at index k for the alphabet at index i
                    decodeArray[k] = (char)intChar; //finally add the char of the integer value to the new decoded array

               } else {
                   decodeArray[k] = ' '; //if not an element in index k, it is a space 
               }
           }
           System.out.println(new String(decodeArray) + "\n"); //prints out array in form of a string instead of iterating through each value of array to print it out 
       }

   }

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); // scanner for input from user
       int input; // input from user for Question we want to do
       String toDecode; //msg to decode 

       System.out.println("Which Q. did you want to do? (1-4)");
       input = scan.nextInt(); //takes users input

       switch (input) { //switch statement for easy change of inputs 
           case 1:
               toDecode = "fqjcb rwjwj vnjax bnkhj whxcq nawjv nfxdu mbvnu ujbbf nnc";
               decode(toDecode);
               break;

           case 2:
               toDecode = "oczmz vmzor jocdi bnojv dhvod igdaz admno ojbzo rcvot jprvi oviyv aozmo cvooj ziejt dojig toczr dnzno jahvi fdiyv xcdzq zoczn zxjiy";
               decode(toDecode);
               break;

           case 3:
               toDecode = "ejitp spawa qleji taiul rtwll rflrl laoat wsqqj atgac kthls iraoa twlpl qjatw jufrh lhuts qataq itats aittk stqfj cae";
               decode(toDecode);
               break;

           case 4:
               toDecode = "iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn jbeuq iihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque aqaqm oejjs hqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj jejjz nshna hnmyt isnae sqfun dqzew qiead zevqi zhnjq shqze udqai jrmtq uishq ifnun siiqa suoij qqfni syyle iszhn bhmei squih nimnx hsead shqmr udquq uaqeu iisqe jshnj oihyy snaxs hqihe lsilu ymhni tyz";
               decode(toDecode);
               break;

           default:
               System.out.println("Wrong input please try again");
               break;

       }

       scan.close(); //close scanner to prevent mem leak

   }
}

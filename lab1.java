import java.util.Scanner;


public class lab1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //scanner for input from user 
        int input; //input from user for Question we want to do
        String toDecode;
      //  boolean exit = false; //dont want to exit yet  
        System.out.println("Which Q. did you want to do? (1-4)");
        input = scan.nextInt();
        
   //    String test[] = {"hello", "one", "three"}; //used to test method below  
     //  toDecode = printArray(test);
    //   System.out.println(toDecode);

       switch (input) {
           case 1:
               toDecode = "fqjcb rwjwj vnjax bnkhj whxcq nawjv nfxdu mbvnu ujbbf nnc";
               System.out.println(toDecode);
               break;

           case 2:
               toDecode = "oczmz vmzor jocdi bnojv dhvod igdaz admno ojbzo rcvot jprvi oviyv aozmo cvooj ziejt dojig toczr dnzno jahvi fdiyv xcdzq zoczn zxjiy";
               System.out.println(toDecode);
               break;

           case 3:
               toDecode = "ejitp spawa qleji taiul rtwll rflrl laoat wsqqj atgac kthls iraoa twlpl qjatw jufrh lhuts qataq itats aittk stqfj cae";
               System.out.println(toDecode);
               break;

           case 4:
               toDecode = "iyhqz ewqin azqej shayz niqbe aheum hnmnj jaqii yuexq ayqkn jbeuq iihed yzhni ifnun sayiz yudhe sqshu qesqa iluym qkque aqaqm oejjs hqzyu jdzqa diesh niznj jayzy uiqhq vayzq shsnj jejjz nshna hnmyt isnae sqfun dqzew qiead zevqi zhnjq shqze udqai jrmtq uishq ifnun siiqa suoij qqfni syyle iszhn bhmei squih nimnx hsead shqmr udquq uaqeu iisqe jshnj oihyy snaxs hqihe lsilu ymhni tyz";
               System.out.println(toDecode);
               break;

           default:
               System.out.println("Wrong input please try again");
               break;

       }
       // System.out.println("Would you like to do another question? (Y for yes and N
       // for no)");

       // have output to see which one to decypher.
       // arrays for each cyper
       // cipher sub for #1 and 2
       // then do the bottom 3
       // then go back to #3 and 4

       scan.close();

   }

   /*
    * insert java doc here
    */
   public static String printArray(String[] array)
    {
        String printedArr = "";
        for(int i = 0; i < array.length; i++)
        {
            printedArr = printedArr.concat(array[i]);
        }        

        return printedArr;
    }
}

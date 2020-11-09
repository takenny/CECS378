
public class fuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String key = "sherlockaxzfgijdbpqtuvwnmy";
		char[] alphaArray = alphabet.toCharArray(); //puts msg from parameter to a char array 
	    char[] keyArray = key.toCharArray();
		int[] decodeArray = new int[alphaArray.length];
		
		for (int i = 0; i < alphaArray.length; i++)
		{
			System.out.println("Difference between " +keyArray[i] + " and " + alphaArray[i] + " is "+ (keyArray[i] - alphaArray[i]) + " .");
		}
		
		
		for (int i = 0; i < alphaArray.length; i++)
		{
			int k = keyArray[i] - alphaArray[i];
			decodeArray[i] = k;
			System.out.print(decodeArray[i] + ",");
		}
	}

}

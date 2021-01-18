package stringmanipulation;

public class CountingFreqinString {

	/**
	 * counting frequency of a character in the string
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "god make my life easy and i received all the blessings from you";
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'e') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
    }  
}  

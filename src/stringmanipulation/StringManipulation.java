package stringmanipulation;

public class StringManipulation {

	/**
	 * example where we are accessing all the elements present at odd index.
	 * @param args
	 */
	
	public static void main(String[] args) {
		String str;
		str= "I can do it, i am going to win and i will get the job soon";
		for(int i=0;i<=str.length()-1;i++) {
			//System.out.println("chat at " + i + "place " + str.charAt(i));
			
			
			if(i%2!=0) {
				
				System.out.println("chat at " + i + "place " + str.charAt(i));
			}
		}
	}

}

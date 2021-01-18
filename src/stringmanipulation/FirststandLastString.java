package stringmanipulation;

public class FirststandLastString {

	public static void main(String[] args) {
	
		String str= "iamgonnwin";
	    int strlength= str.length();
	   // get the 1st letter
	    System.out.println("!st letter of string is : " + str.charAt(0));
	    //last string
	    System.out.println("Last letter of the string is : "+ str.charAt(strlength-1));
	}

}

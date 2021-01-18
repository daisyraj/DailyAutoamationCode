package stringmanipulation;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="testing";
		String s2="Automation";
		String s4="testing";
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("------------------------------------------");
		String S5= "String is comparison with the help of contains";
		System.out.println(S5.contains("string"));
	}

}

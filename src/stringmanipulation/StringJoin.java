package stringmanipulation;

import java.util.regex.Pattern;

public class StringJoin {
	
	/**
	 * this program to join two words so syntax is string.join
	 * @param args
	 */

	public static void main(String[] args) {
		String str = String.join("-", "Daisy", "You", "Can", "Do", "it");
		System.out.println(str);

		System.out.println("----------------------------------------");
		/**
		 * this program to replace the words or letters by simply using string.replace
		 */
		
		String s1 = "God is with me and he will help me get the new job";
		String s5=s1.toUpperCase();
		System.out.println(s5);
		System.out.println("------------------------------------------");
		String s6=s5.toLowerCase();
		System.out.println(s6);
		System.out.println("-------------------------------------------");
		String s3 = "oooooooooooo-hhhhhhhhhhh-mmmmmmmmmmmmmmm";
		String s2 = s1.replace("the", "to");
		System.out.println(s2);
		String s4 = s3.replace("o", "i");
		System.out.println(s4);
		
		System.out.println("---------------------------------------------");
		//patter matches
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{18}","daisyraj2919882Raj"));
		
	}

}

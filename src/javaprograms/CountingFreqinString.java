package javaprograms;

import jdk.internal.misc.FileSystemOption;

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
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("Frequency of t is: " + count);
		/**
		 * use of endsWith keyword
		 */
		System.out.println("-------------------------------------------------------");

		String lastone = "jesusyouarewithme.com";
		System.out.println(lastone.endsWith("withme"));

		if (lastone.endsWith("jesus")) {
			System.out.println("its true");
		}

		else {
			System.out.println("its false");
		}

		System.out.println("------------------------------------------------------------");
/**
 * checking two strings are equals or not.
 * 
 */
		String s1 = "I Got a job";
		String s2 = "I purched new house";
		String s3 = "I got a job";

		if (s1.equals(s3)) {
			System.out.println("String is equals");
		} else {
			System.out.println("String is not equals");
		}

	}

}

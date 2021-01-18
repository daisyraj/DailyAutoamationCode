package stringmanipulation;


import java.util.ArrayList;

public class StringinList {
/**
 * eqality of string present in the list
 * @param args
 */
	public static void main(String[] args) {
		
		String Str1= "DAiSy";
		ArrayList<String> l1= new ArrayList<>();
		l1.add("Rylan");
		l1.add("Daniel");
		l1.add("Rossi");
		l1.add("Treza");
		l1.add("Daisy");
		for(String str:l1) {
			if(str.equalsIgnoreCase(Str1)) {
				System.out.println("strings are equals");
			}
			else {
				System.out.println("String are not equals");
			}
		}

	}

}

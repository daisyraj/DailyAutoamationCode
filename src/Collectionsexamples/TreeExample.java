
package Collectionsexamples;

import java.util.TreeSet;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> str= new TreeSet<String>();
		str.add("Anni");
		str.add("Rossi");
		str.add("Rylan");
		str.add("Daniel");
		str.add("Daisy");
		str.add("Treza");
		System.out.println("-------------decending the list-------------------");
		System.out.println(str.descendingSet());
		
		System.out.println("-------------first and last value------------------");
		System.out.println("Frist value : " + str.pollFirst());
		System.out.println("Last Value : " + str.pollLast());
		System.out.println("tail set" + str.tailSet("Rossi"));
		
		
	}

}

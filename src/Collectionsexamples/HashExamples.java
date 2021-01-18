package Collectionsexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashExamples {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();
		hset.add("Data");
		hset.add("Map");
		hset.add("Icandoit");
		hset.add("Name");

		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println("Hastset " + itr.next());
		}

		System.out.println(hset.contains("Data"));

		HashSet<String> hint = new HashSet<>();
		hint.add("10");
		hint.add("20");
		hint.add("30");
		hint.add("40");
		Iterator<String> itr1 = hint.iterator();
		while (itr1.hasNext()) {
			System.out.println("Integer" + itr1.next());
		}

		hset.addAll(hint);
		System.out.println(hset);
		System.out.println("----------------------------------Remove Name------------------------------------");
		hset.remove("Name");
		System.out.println(hset);
		
		System.out.println("---------------------Remove on ifcondition : Data---------------------------");
		hset.removeIf(str -> str.contains("Data"));
		System.out.println(hset);
		
	}

}

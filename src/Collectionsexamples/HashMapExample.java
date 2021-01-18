package Collectionsexamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"daisy");
		map.put(2,"Rossi");
		map.put(3, "daniel");
		map.put(4,"Rylan");
		
		Set set = map.entrySet();
		
		Iterator itr= set.iterator();
		
		while(itr.hasNext()) {
		Map.Entry entry = (Map.Entry)itr.next();
		System.out.println(entry.getKey() + " " + entry.getValue());
			
			 map.entrySet()  
		      //Returns a sequential Stream with this collection as its source  
		      .stream()  
		      //Sorted according to the provided Comparator  
		      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
		      //Performs an action for each element of this stream  
		      .forEach(System.out::println);  
		}
	}

}

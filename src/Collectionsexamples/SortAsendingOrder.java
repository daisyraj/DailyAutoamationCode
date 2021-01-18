package Collectionsexamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortAsendingOrder {

	public static void main(String[] args) {
		
		ArrayList<String> lstsort = new ArrayList<String>();
		lstsort.add("daisy");
		lstsort.add("rossi");
		lstsort.add("cab");
		lstsort.add("marsh");
		lstsort.add("pen");
		lstsort.add("zip");
		lstsort.add("uae");
		lstsort.add("eco");
		
		Collections.sort(lstsort);
//		Iterator<String> itr= lstsort.iterator();
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
		
		System.out.println(lstsort);
		
		System.out.println("-----------------------------------recerse order------------------");
		
		Collections.sort(lstsort, Collections.reverseOrder());
		
		Iterator<String> itr1= lstsort.iterator();
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
		
			
	}

}

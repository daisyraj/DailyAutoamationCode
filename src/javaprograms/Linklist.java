package javaprograms;
import java.util.ArrayList;
import java.util.Iterator;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("Daisy");
		ar1.add("Rylan");
		ar1.add("Daniel");
		ar1.add("Rossi");
		//ar1.remove(index)
//		String arsize= ar1.remove(1);
//		System.out.println(arsize);
		
		System.out.println(ar1);
		Iterator<String> itr = ar1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ar1.clone();
		System.out.println(ar1);
		System.out.println("------------------------");
		for(int i=0; i<ar1.size();i++) {
			String ar= ar1.get(i);
			System.out.println(ar);
		}
		
	}

}

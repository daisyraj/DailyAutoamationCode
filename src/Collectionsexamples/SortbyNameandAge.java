package Collectionsexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortbyNameandAge {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList alldata = new ArrayList();
		alldata.add(new Student(101,"Daniel", 1));
		alldata.add(new Student(105,"Rylan", 10));
		alldata.add(new Student(107,"Jesus", 12));
		alldata.add(new Student(100,"Ethan", 8));
		
		
		System.out.println("----------------Sort by name------------------");
		Collections.sort(alldata, new NameComparator());
		Iterator itr=alldata.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

		System.out.println("-------------Sort by age-------------------");
		
		Collections.sort(alldata,new AgeComparator());
		Iterator itr1=alldata.iterator();
		while(itr1.hasNext()) {
			Student st1=(Student)itr1.next();
			System.out.println(st1.name+ " " +st1.age +" "+ st1.rollno +" ");
		}
	}

}

package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationCall extends encapsulation{

	public EncapsulationCall(String car, String company, String number) {
		super(car, company, number);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		List<EncapsulationCall> list = new ArrayList<EncapsulationCall>();
		
	 list.add(new EncapsulationCall("Q5", "audi", "one"));
	 list.add(new EncapsulationCall("Q7", "bmw", "two"));

	 System.out.println(list.get(0).getNumber());
	 System.out.println(list.get(1));
	}

}

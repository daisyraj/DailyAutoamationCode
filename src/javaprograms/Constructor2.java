package javaprograms;

public class Constructor2 extends Constructor {
	
	
	Constructor2(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}
	public void add2() {
		System.out.println("cust2 ");
		
	}
	public static void main(String[] args) {
		Constructor2 ctl2 = new Constructor2(9,12);
		//ctl2.add();
	}

}

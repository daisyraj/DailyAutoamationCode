package javaprograms;

public class AbstractExample extends Abstractexp {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

	public static void main(String[] args) {
  AbstractExample abssub = new AbstractExample();
		
		abssub.sub();
		abssub.add();
		abssub.mul();
		abssub.div();
		
	}
	
	

}

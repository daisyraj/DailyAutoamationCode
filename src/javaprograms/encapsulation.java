package javaprograms;

public class encapsulation {

	
	
	private	String car;
	private String company;
	private String number;
	
	
	
	public encapsulation(String car, String company, String number) {
		super();
		this.car = car;
		this.company = company;
		this.number = number;
	}





	public String getCar() {
		return car;
	}





	@Override
	public String toString() {
		return "encapsulation [car=" + car + ", company=" + company + ", number=" + number + "]";
	}





	public void setCar(String car) {
		this.car = car;
	}





	public String getCompany() {
		return company;
	}





	public void setCompany(String company) {
		this.company = company;
	}





	public String getNumber() {
		return number;
	}





	public void setNumber(String number) {
		this.number = number;
	}

}

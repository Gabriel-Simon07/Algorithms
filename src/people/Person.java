package people;

public class Person {
	double annualIncome;
	String name;
	
	public Person(double annualIncome, String name) {
		this.annualIncome = annualIncome;
		this.name = name;
	}
	
	public Person() {}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package people;

public class Company extends Person {
	int numberOfEmployees;

	public Company() {}
		
	public Company(double annualIncome, String name, int numberOfEmployees) {
		super(annualIncome, name);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		return getNumberOfEmployees() > 10 ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.26;
	}
}
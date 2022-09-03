package people;

public class LegalPerson extends Person {
	int numberOfEmployees;

	public LegalPerson() {}
		
	public LegalPerson(double annualIncome, String name, int numberOfEmployees) {
		super(annualIncome, name);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
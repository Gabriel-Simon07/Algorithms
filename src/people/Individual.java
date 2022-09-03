package people;

public class Individual extends Person {
	double healthSpending;

	public Individual() {}

	public Individual(double annualIncome, String name, double healthSpending) {
		super(annualIncome, name);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	public double caculateAnnualIncome() {
		if(annualIncome < 20000) {
			return annualIncome * 0.15;
		}
		if(annualIncome > 20000) {
			return annualIncome * 0.25;
		}
		return annualIncome * 0.50;
	}
}

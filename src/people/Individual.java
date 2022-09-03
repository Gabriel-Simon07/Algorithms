package people;

public class Individual extends Person {
	double healthSpending;

	public Individual() {
	}

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

	@Override
	public double tax() {
		double basicTax = getAnnualIncome() < 2000 ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
		basicTax -= getAnnualIncome() * 0.5;
		if (basicTax < 0) {
			return 0.0;
		} else {
			return basicTax;
		}
	}
}

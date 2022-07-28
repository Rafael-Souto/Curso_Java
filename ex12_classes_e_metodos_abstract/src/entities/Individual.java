package entities;

public class Individual extends TaxesPaid {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double res = 0;
		if (getAnualIncome() < 20000.00) {
			res = getAnualIncome() * 0.15;
		} 
		else {
			res = getAnualIncome() * 0.25;
		}
		
		res -= getHealthExpenditures() * 0.50;

		if (res < 0.0) {
			return 0.0;
		} 
		else {
			return res;
		}
	}
}
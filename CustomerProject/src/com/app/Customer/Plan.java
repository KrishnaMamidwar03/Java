package com.app.Customer;

public enum Plan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double plansCharge;

	Plan(double plansCharge) {
		this.plansCharge = plansCharge;
	}

	@Override
	public String toString() {
		return name() + " : " + plansCharge;
	}

	public double getPlanCost() {
		return plansCharge;
	}
}

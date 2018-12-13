package com.futchas.tariffcomparison.product;


public class ProductB implements Product {
	
	@Override
	public String getName() {
		return "Packaged tariff";
	}
	
	
	/**
	 * Calculation: 800 € for up to 4000 kWh/year and above 4000 kWh/year additionally 30 cent/kWh. Examples below:
	 * Consumption = 3500 kWh/year => Annual costs = 800 €/year
	 * Consumption = 4500 kWh/year => Annual costs = 950 €/year (800€ + 500 kWh * 30
	 * cent/kWh = 150 € additional consumption costs)
	 * Consumption = 6000 kWh/year => Annual costs = 1400 €/year (800€ + 2000 kWh * 30
	 * cent/kWh = 600 € additional consumption costs)
	 */
	@Override
	public double calculationModel(int consumption) {
		double additionalCosts = 0;
		int additionalConsumption = consumption - 4000;
		if(additionalConsumption > 0)
			additionalCosts = additionalConsumption * 0.3;
		return 800 + additionalCosts;
	}
}

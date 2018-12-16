package com.futchas.tariffcomparison.product;

public class ProductBasicTariff implements Product {
	
	@Override
	public String getName() {
		return "basic electricity tariff";
	}
	
	/**
	 * Calculation: base costs per year 60€ + consumption costs 22 cent/kWh. Examples below:
	 * Consumption = 3500 kWh/year => Annual costs = 830 €/year (5€ * 12 months = 60 €
	 * base costs + 3500 kWh/year * 22 cent/kWh = 770 € consumption costs)
	 * Consumption = 4500 kWh/year => Annual costs = 1050 €/year (5€ * 12 months = 60 €
	 * base costs + 4500 kWh/year * 22 cent/kWh = 990 € consumption costs)
	 * Consumption = 6000 kWh/year => Annual costs = 1380 €/year (5€ * 12 months = 60 €
	 * base costs + 6000 kWh/year * 22 cent/kWh = 1320 € consumption costs)
	 */
	@Override
	public double calculationModel(int consumption) {
		consumption = consumption > 0 ? consumption : 0;
		double baseCostsYearly = 60;
		double consumptionCosts = consumption * 0.22;
		return baseCostsYearly + consumptionCosts;
	}
}

package com.futchas.tariffcomparison;

import com.futchas.tariffcomparison.tariff.Tariff;
import com.futchas.tariffcomparison.tariff.Tariffs;
import com.futchas.tariffcomparison.product.ProductBasicTariff;
import com.futchas.tariffcomparison.product.ProductPackagedTariff;

public class Application {
	
	public static void main(String[] args) {
		
		System.out.println("Please provide your annual consumption (kWh/year): ");
		
		int consumption = new InputChecker().check(System.in);
		
		Tariffs tariffs = new Tariffs();
		tariffs.add(new Tariff(new ProductBasicTariff(), consumption));
		tariffs.add(new Tariff(new ProductPackagedTariff(), consumption));
		tariffs.sortByAnnualCosts().forEach(System.out::println);
		
	}
	
	
}

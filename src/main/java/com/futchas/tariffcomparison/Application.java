package com.futchas.tariffcomparison;

import com.futchas.tariffcomparison.tariff.Tariff;
import com.futchas.tariffcomparison.tariff.Tariffs;
import com.futchas.tariffcomparison.product.ProductA;
import com.futchas.tariffcomparison.product.ProductB;

public class Application {
	
	public static void main(String[] args) {
		
		System.out.println("Please provide your annual consumption (kWh/year): ");
		
		int consumption = new InputChecker().check(System.in);
		
		Tariffs tariffs = new Tariffs();
		tariffs.add(new Tariff(new ProductA(), consumption));
		tariffs.add(new Tariff(new ProductB(), consumption));
		tariffs.sortByAnnualCosts().forEach(System.out::println);
		
	}
	
	
}

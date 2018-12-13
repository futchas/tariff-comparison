package com.futchas.tariffcomparison.tariff;

import java.text.NumberFormat;
import java.util.Locale;

import com.futchas.tariffcomparison.product.Product;

public class Tariff {
	
	private String name;
	private double annualCosts;
	
	public Tariff(Product product, int consumption) {
		this.name = product.getName();
		
		this.annualCosts = product.calculationModel(consumption);
	}
	
	public double getAnnualCosts() {
		return annualCosts;
	}
	
	@Override
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("de", "DE"));
		return "Tariff{" +
				"name='" + name + '\'' +
				", annualCosts=" + formatter.format(annualCosts) +
				'}';
	}
}

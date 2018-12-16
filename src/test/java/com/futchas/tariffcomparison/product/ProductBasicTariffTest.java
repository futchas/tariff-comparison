package com.futchas.tariffcomparison.product;

import com.futchas.tariffcomparison.tariff.Tariff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductBasicTariffTest {
	
	private Product product;
	@BeforeEach
	void setUp() {
		product = new ProductBasicTariff();
	}
	
	@Test
	void calculate3500Consumption() {
		Tariff tariff = new Tariff(product, 3500);
		assertThat(tariff.getAnnualCosts()).isEqualTo(830);
	}
	
	@Test
	void calculate4500Consumption() {
		Tariff tariff = new Tariff(product, 4500);
		assertThat(tariff.getAnnualCosts()).isEqualTo(1050);
	}
	
	@Test
	void calculate6000Consumption() {
		Tariff tariff = new Tariff(product, 6000);
		assertThat(tariff.getAnnualCosts()).isEqualTo(1380);
	}
	
	@Test
	void calculateZeroConsumption() {
		Tariff tariff = new Tariff(product, 0);
		assertThat(tariff.getAnnualCosts()).isEqualTo(60);
	}
	
	@Test
	void calculateNegativeConsumption() {
		Tariff tariff = new Tariff(product, -1);
		assertThat(tariff.getAnnualCosts()).isEqualTo(60);
	}
	
}
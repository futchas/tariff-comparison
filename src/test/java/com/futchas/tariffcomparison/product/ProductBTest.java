package com.futchas.tariffcomparison.product;

import com.futchas.tariffcomparison.tariff.Tariff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductBTest {
	
	
	private Product product;
	@BeforeEach
	void setUp() {
		product = new ProductB();
	}
	
	@Test
	void calculate3500Consumption() {
		Tariff tariff = new Tariff(product, 3500);
		assertThat(tariff.getAnnualCosts()).isEqualTo(800);
	}
	
	@Test
	void calculate4000Consumption() {
		Tariff tariff = new Tariff(product, 4000);
		assertThat(tariff.getAnnualCosts()).isEqualTo(800);
	}
	
	@Test
	void calculate4001Consumption() {
		Tariff tariff = new Tariff(product, 4001);
		assertThat(tariff.getAnnualCosts()).isEqualTo(800.3);
	}
	
	@Test
	void calculate4500Consumption() {
		Tariff tariff = new Tariff(product, 4500);
		assertThat(tariff.getAnnualCosts()).isEqualTo(950);
	}
	
	@Test
	void calculate6000Consumption() {
		Tariff tariff = new Tariff(product, 6000);
		assertThat(tariff.getAnnualCosts()).isEqualTo(1400);
	}
	
	@Test
	void calculateZeroConsumption() {
		Tariff tariff = new Tariff(product, 0);
		assertThat(tariff.getAnnualCosts()).isEqualTo(800);
	}
	
	@Test
	void calculateNegativeConsumption() {
		Tariff tariff = new Tariff(product, -1);
		assertThat(tariff.getAnnualCosts()).isEqualTo(800);
	}
}
package com.futchas.tariffcomparison.tariff;

import java.util.List;
import java.util.stream.Collectors;

import com.futchas.tariffcomparison.product.ProductA;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TariffsTest {
	
	@Test
	void tariffsSortedByTotalCosts() {
		ProductA productA = new ProductA();
		Tariffs tariffs = new Tariffs();
		tariffs.add(new Tariff(productA, 3000));
		tariffs.add(new Tariff(productA, 1000));
		List<Tariff> sortedTariff = tariffs.sortByAnnualCosts().collect(Collectors.toList());
		assertThat(sortedTariff.get(0).getAnnualCosts())
				.isLessThan(sortedTariff.get(1).getAnnualCosts());
	}
}
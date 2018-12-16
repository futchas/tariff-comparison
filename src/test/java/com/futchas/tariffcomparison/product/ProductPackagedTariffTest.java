package com.futchas.tariffcomparison.product;

import com.futchas.tariffcomparison.tariff.Tariff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ProductPackagedTariffTest {


	private Product product;

	@BeforeEach
	void setUp() {
		product = new ProductPackagedTariff();
	}

	@ParameterizedTest(name = "{index} => consumption={0}, expectedAnnualCosts={1}")
	@MethodSource("paramProvider")
	void calculateConsumption(int consumption, double expectedAnnualCosts) {
		Tariff tariff = new Tariff(product, consumption);
		assertThat(tariff.getAnnualCosts()).isEqualTo(expectedAnnualCosts);
	}

	private static Stream<Arguments> paramProvider() {
		return Stream.of(
				Arguments.of(3500, 800),
				Arguments.of(4000, 800),
				Arguments.of(4001, 800.3),
				Arguments.of(4500, 950),
				Arguments.of(6000, 1400),
				Arguments.of(0, 800),
				Arguments.of(-1, 800)
		);
	}

}
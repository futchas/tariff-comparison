package com.futchas.tariffcomparison;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputCheckerTest {
	
	private InputChecker inputChecker;
	
	@BeforeEach
	void setUp() {
		inputChecker = new InputChecker();
	}
	
	@Test
	void checkValidValue() {
		int consumption = inputChecker.check(inputToInputStream("3000"));
		assertThat(consumption).isEqualTo(3000);
	}
	
	@Test
	void checkNegativeValue() {
		int consumption = inputChecker.check(inputToInputStream("-1\n0"));
		assertThat(consumption).isEqualTo(0);
	}
	
	@Test
	void checkInvalidValue() {
		int consumption = inputChecker.check(inputToInputStream("aaa\n1k\n1000"));
		assertThat(consumption).isEqualTo(1000);
	}
	
	private ByteArrayInputStream inputToInputStream(String value) {
		return new ByteArrayInputStream(value.getBytes());
	}
	
}
package com.futchas.tariffcomparison.tariff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Tariffs extends ArrayList<Tariff> {
	
	public Stream<Tariff> sortByAnnualCosts() {
		return this.stream().sorted(Comparator.comparing(Tariff::getAnnualCosts));
	}
	
}

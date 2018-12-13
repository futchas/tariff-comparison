package com.futchas.tariffcomparison.product;


/**
 * Implement the Product interface when a different calculation of the annual costs is needed
 */
public interface Product {
	
	String getName();
	
	/**
	 * Implement this method to define the annual costs by using a specific calculation
	 * @param consumption the users annual consumption (kWh/year)
	 * @return the calculated annual costs
	 */
	double calculationModel(int consumption);
}

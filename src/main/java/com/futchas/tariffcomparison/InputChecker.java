package com.futchas.tariffcomparison;

import java.io.InputStream;
import java.util.Scanner;

class InputChecker {
	
	/**
	 * Runs until a valid input (number is at least 0 and no letters) is given by the user
	 * @param inputStream The input of the user (System.in) but can be replaced for test purposes (e.g. ByteArrayInputStream)
	 * @return valid input of consumption will be returned as an integer
	 */
	int check(InputStream inputStream) {
		Scanner scanner = new Scanner(inputStream);
		int consumption = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			if (scanner.hasNextInt()) {
				consumption = scanner.nextInt();
				if (consumption < 0)
					System.out.println("Consumption value needs to be above 0!");
				else
					isInvalid = false;
			} else {
				System.out.println("Invalid input! Only numbers accepted");
				scanner.next();
			}
		}
		return consumption;
	}
	
}

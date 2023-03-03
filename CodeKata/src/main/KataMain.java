package main;

import java.util.Arrays;
import java.util.List;

public class KataMain {

	public int add(String stringNumbers) {
		int total = 0;

		stringNumbers = stringNumbers.replace("\n", ",");
		List<String> numbers = Arrays.asList(stringNumbers.split(","));

		for (String number : numbers) {
			try {
				total = total + Integer.valueOf(number);
			} catch (NumberFormatException e) {

			}
		}

		return total;

	}
}

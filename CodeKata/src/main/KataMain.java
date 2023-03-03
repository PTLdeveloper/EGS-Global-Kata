package main;

import java.util.Arrays;
import java.util.List;

public class KataMain {

	public int add(String stringNumbers) throws Exception {
		int total = 0;
		String negativeNumbers = new String();

		String delimiter = ","; // default delimiter

		// Check for delimiter
		if (stringNumbers.startsWith("\\") & stringNumbers.length() >= 3) {
			delimiter = stringNumbers.substring(1, 2);

			stringNumbers = stringNumbers.substring(2);
		}

		stringNumbers = stringNumbers.replace("\n", delimiter);
		List<String> numbers = Arrays.asList(stringNumbers.split(delimiter));

		for (String number : numbers) {
			try {

				int num = Integer.valueOf(number);

				if (num < 0) {

					if (!negativeNumbers.isEmpty()) {
						negativeNumbers = negativeNumbers + ",";
					}
					negativeNumbers = negativeNumbers + num;
				} else {
					total = total + num;
				}
			} catch (NumberFormatException e) {
				// do nothing
			}
		}

		if (!negativeNumbers.isEmpty()) {
			throw new Exception("Negatives not allowed: " + negativeNumbers);
		}

		return total;

	}
}

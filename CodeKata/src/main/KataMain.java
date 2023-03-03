package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KataMain {

	private final String DEFAULT_DELIMITER = ",";

	public int add(String stringNumbers) throws Exception {
		int total = 0;
		String negativeNumbers = new String();

		String cleanStringNumbers = cleanString(stringNumbers);

		List<String> numbers = Arrays.asList(cleanStringNumbers.split(DEFAULT_DELIMITER));

		for (String number : numbers) {
			try {

				int num = Integer.valueOf(number);

				if (num > 1000)
					continue;

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

	private String cleanString(String text) {

		// Find delimiters
		List<String> delimiters = new ArrayList<>();

		if (text.startsWith("//") & text.length() >= 3) {

			String delimiter = text.substring(2, 3);

			if (delimiter.equals("[")) {
				while ((text.contains("["))) {
					int startDelimeterIndex = text.indexOf("[");
					int endDelimeterIndex = text.indexOf("]");
					delimiter = text.substring(startDelimeterIndex + 1, endDelimeterIndex);
					delimiters.add(delimiter);
					text = text.substring(endDelimeterIndex + 1);
				}
			} else {
				delimiters.add(delimiter);
				text = text.substring(3);
			}

		}

		// Clean the string

		text = text.replace("\n", DEFAULT_DELIMITER);

		for (String delimiter : delimiters) {
			text = text.replace(delimiter, DEFAULT_DELIMITER);
		}

		return text;

	}
}

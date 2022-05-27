package com.chainsys.miniproject.commonutil.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException {
		boolean result = false;
		for (int i = 0; i < data.length(); i++) {
			int c = (int) data.charAt(i);
			if (!(c >= 48 && c <= 58)) {
				result = false;
			}
		} // if data is invalid throw new InvalidInputDataException("The value in string
			// must contain only numbers ");
		return result;
	}

	public static boolean checkNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		boolean result = false;
		if (data <= 20) {
			throw new InvalidInputDataException("The value must be greater then zero");
		} // if data is invalid throw new InvalidInputDataException("The value must be
			// greater then zero");
		return result;
	}

	public static boolean checkCharLessThanTwenty(String data) throws InvalidInputDataException {
		boolean result = false;
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ' ') {
				count++;
			}
			if (count >= 20) {
				throw new InvalidInputDataException("The value of character must be less then twenty digit");
			}
		}
		return result;
	}

	public static boolean checkMailContainsAtsymbol(String data) throws InvalidInputDataException {
		boolean result = false;
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		Matcher m = p.matcher(data);

		if (!m.find()) {
			throw new InvalidInputDataException("The Input Data is not valid ");
		}
		return result;
	}

	public static boolean checkNumberLessThanTenDigit(Float data) throws InvalidInputDataException {
		boolean result = false;
		String d = Float.toString(data);
		int count = 0;
		for (int i = 0; i < d.length(); i++) {
			if (d.charAt(i) != ' ') {
				count++;
			}
			if (count >= 10) {
				throw new InvalidInputDataException("The Digits of Number must be less then ten digit");
			}
		}
		return result;
	}
}

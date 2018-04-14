package com.yamounane.kata.romannumerals;

/**
 * @author yassine
 *
 */
public class RomansNumeralsService {

	public String translate(int i) {
		String result = "";
		if (i < 4) {
			for (int j = 0; i > j; j++) {
				result += "I";
			}
			return result;
		}
		return translate(i, result);
	}

	private String translate(int i, String translate) {
		switch (i) {
		case 4:
			translate += "IV";
			break;
		case 5:
			translate += "V";
			break;
		case 10:
			translate += "X";
			break;
		case 50:
			translate += "L";
			break;
		case 100:
			translate += "C";
			break;
		case 500:
			translate += "D";
			break;
		case 1000:
			translate += "M";
			break;
		}
		return translate;
	}

}

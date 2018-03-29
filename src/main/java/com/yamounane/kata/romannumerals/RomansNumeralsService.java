package com.yamounane.kata.romannumerals;

/**
 * @author yassine
 *
 */
public class RomansNumeralsService {

	public String translate(int i) {
		switch (i) {
		case 1:
			return "I";
		case 5:
			return "V";
		case 10:
			return "X";
		default:
			return "";
		}
	}

}

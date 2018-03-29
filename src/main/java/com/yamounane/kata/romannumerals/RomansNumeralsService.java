package com.yamounane.kata.romannumerals;

/**
 * @author yassine
 *
 */
public class RomansNumeralsService {

	public String translate(int i) {
		if (i == 1) {
			return "I";
		} else if (i == 5) {
			return "V";
		}
		return "";
	}

}

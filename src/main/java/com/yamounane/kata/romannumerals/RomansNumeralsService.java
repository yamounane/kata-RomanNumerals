package com.yamounane.kata.romannumerals;

/**
 * @author yassine
 *
 */
public class RomansNumeralsService {

	private Integer[] decimals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public String translate(int romanNumber) {
		String translation = "";

		for (int i = 0; i < decimals.length; i++) {
			while (romanNumber % decimals[i] < romanNumber) {
				translation += romans[i];
				romanNumber -= decimals[i];
			}
		}
		return translation;
	}

}

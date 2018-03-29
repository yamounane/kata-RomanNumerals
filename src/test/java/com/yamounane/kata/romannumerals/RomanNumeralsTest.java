package com.yamounane.kata.romannumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * @author yassine
 */
public class RomanNumeralsTest {

	private RomansNumeralsService romanNumeralsService;

	@Before
	public void setUp() {
		this.romanNumeralsService = new RomansNumeralsService();
	}

	@Test
	public void should_return_I_when_1_is_passed() {
		assertThat(romanNumeralsService.translate(1)).isEqualTo("I");
	}

	@Test
	public void should_return_V_when_5_is_passed() {
		assertThat(romanNumeralsService.translate(5)).isEqualTo("V");
	}

	@Test
	public void should_return_X_when_10_is_passed() {
		assertThat(romanNumeralsService.translate(10)).isEqualTo("X");
	}

	@Test
	public void should_return_II_when_2_is_passed() {
		assertThat(romanNumeralsService.translate(2)).isEqualTo("II");
	}

}

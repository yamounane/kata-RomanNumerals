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
	public void should_return_II_when_2_is_passed() {
		assertThat(romanNumeralsService.translate(2)).isEqualTo("II");
	}

	@Test
	public void should_return_III_when_3_is_passed() {
		assertThat(romanNumeralsService.translate(3)).isEqualTo("III");
	}

	@Test
	public void should_return_IV_when_4_is_passed() {
		assertThat(romanNumeralsService.translate(4)).isEqualTo("IV");
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
	public void should_return_L_when_50_is_passed() {
		assertThat(romanNumeralsService.translate(50)).isEqualTo("L");
	}

	@Test
	public void should_return_C_when_100_is_passed() {
		assertThat(romanNumeralsService.translate(100)).isEqualTo("C");
	}

	@Test
	public void should_return_D_when_500_is_passed() {
		assertThat(romanNumeralsService.translate(500)).isEqualTo("D");
	}

	@Test
	public void should_return_M_when_1000_is_passed() {
		assertThat(romanNumeralsService.translate(1000)).isEqualTo("M");
	}

}

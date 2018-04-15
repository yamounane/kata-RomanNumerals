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
	public void should_return_VI_when_6_is_passed() {
		assertThat(romanNumeralsService.translate(6)).isEqualTo("VI");
	}

	@Test
	public void should_return_VII_when_7_is_passed() {
		assertThat(romanNumeralsService.translate(7)).isEqualTo("VII");
	}

	@Test
	public void should_return_VIII_when_8_is_passed() {
		assertThat(romanNumeralsService.translate(8)).isEqualTo("VIII");
	}

	@Test
	public void should_return_IX_when_9_is_passed() {
		assertThat(romanNumeralsService.translate(9)).isEqualTo("IX");
	}

	@Test
	public void should_return_X_when_10_is_passed() {
		assertThat(romanNumeralsService.translate(10)).isEqualTo("X");
	}

	@Test
	public void should_return_XI_when_11_is_passed() {
		assertThat(romanNumeralsService.translate(11)).isEqualTo("XI");
	}

	@Test
	public void should_return_XLII_when_42_is_passed() {
		assertThat(romanNumeralsService.translate(42)).isEqualTo("XLII");
	}

	@Test
	public void should_return_L_when_50_is_passed() {
		assertThat(romanNumeralsService.translate(50)).isEqualTo("L");
	}

	@Test
	public void should_return_XC_when_90_is_passed() {
		assertThat(romanNumeralsService.translate(90)).isEqualTo("XC");
	}

	@Test
	public void should_return_XCIV_when_94_is_passed() {
		assertThat(romanNumeralsService.translate(94)).isEqualTo("XCIV");
	}

	@Test
	public void should_return_XCV_when_95_is_passed() {
		assertThat(romanNumeralsService.translate(95)).isEqualTo("XCV");
	}

	@Test
	public void should_return_C_when_100_is_passed() {
		assertThat(romanNumeralsService.translate(100)).isEqualTo("C");
	}

	@Test
	public void should_return_CLXVII_when_167_is_passed() {
		assertThat(romanNumeralsService.translate(167)).isEqualTo("CLXVII");
	}

	@Test
	public void should_return_CD_when_400_is_passed() {
		assertThat(romanNumeralsService.translate(400)).isEqualTo("CD");
	}

	@Test
	public void should_return_D_when_500_is_passed() {
		assertThat(romanNumeralsService.translate(500)).isEqualTo("D");
	}

	@Test
	public void should_return_DCLXXXVII_when_687_is_passed() {
		assertThat(romanNumeralsService.translate(687)).isEqualTo("DCLXXXVII");
	}

	@Test
	public void should_return_M_when_1000_is_passed() {
		assertThat(romanNumeralsService.translate(1000)).isEqualTo("M");
	}

	@Test
	public void should_return_MDLXXXVII_when_1587_is_passed() {
		assertThat(romanNumeralsService.translate(1587)).isEqualTo("MDLXXXVII");
	}

	@Test
	public void should_return_MMMCDL_when_2450_is_passed() {
		assertThat(romanNumeralsService.translate(2450)).isEqualTo("MMCDL");
	}

	@Test
	public void should_return_MMMCDL_when_2999_is_passed() {
		assertThat(romanNumeralsService.translate(2999)).isEqualTo("MMCMXCIX");
	}

	@Test
	public void should_return_MMM_when_3000_is_passed() {
		assertThat(romanNumeralsService.translate(3000)).isEqualTo("MMM");
	}

}

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
}

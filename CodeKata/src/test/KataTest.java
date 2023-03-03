package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.KataMain;

class KataTest {

	@Test
	void testEmptyString() {

		KataMain kata = new KataMain();
		int result = kata.add("");
		assertEquals(0, result);
	}

	@Test
	void testStringOne() {

		KataMain kata = new KataMain();
		int result = kata.add("5");
		assertEquals(5, result);
	}

	@Test
	void testStringTwo() {

		KataMain kata = new KataMain();
		int result = kata.add("5,1");
		assertEquals(6, result);
	}

	@Test
	void testStringFive() {

		KataMain kata = new KataMain();
		int result = kata.add("5,4,3,2,1");
		assertEquals(15, result);
	}
}

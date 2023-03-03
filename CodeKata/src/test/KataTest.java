package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.KataMain;

class KataTest {

	@Test
	void testEmptyString() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("");
		assertEquals(0, result);
	}

	@Test
	void testStringOne() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("5");
		assertEquals(5, result);
	}

	@Test
	void testStringTwo() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("5,1");
		assertEquals(6, result);
	}

	@Test
	void testStringFive() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("5,4,3,2,1");
		assertEquals(15, result);
	}

	@Test
	void testStringLines() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("1\n2,3");
		assertEquals(6, result);
	}

	@Test
	void testStringDelimiter() throws Exception {

		KataMain kata = new KataMain();
		int result = kata.add("\\;1\n2;3");
		assertEquals(6, result);
	}

	@Test
	void testStrinNegative() {

		KataMain kata = new KataMain();
		try {
			int result = kata.add("2,-4,3,-5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testStringBigNumbers() throws Exception {
		KataMain kata = new KataMain();
		int result = kata.add("1001,2,1");
		assertEquals(3, result);
	}
}

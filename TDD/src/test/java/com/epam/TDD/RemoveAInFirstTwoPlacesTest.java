package com.epam.TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class RemoveAInFirstTwoPlacesTest {
	/* TODO LIST FOR MY FEATURE
	 * 1.2 chars "AB" => "B" - SUCCESS
	 * 2.1 chars "A" => "" - SUCCESS
	 * 3.4 chars "BCAS" => "BCAS" - SUCCESS
	 * 4.0 char "" => "" - SUCCESS
	 */
	RemoveAInFirstTwoPlaces obj;
	@BeforeEach
	void build() {
		obj=new RemoveAInFirstTwoPlaces();
	}
	@Test
	void test2Chars() {
		assertEquals("B",obj.remove("AB"));
	}
	@Test
	void test1Chars() {
		assertEquals("",obj.remove("A"));
	}
	@Test
	void test4Chars() {
		assertEquals("BCAS",obj.remove("BCAS"));
	}
	@Test
	void test0Chars() {
		assertEquals("",obj.remove(""));
	}
}

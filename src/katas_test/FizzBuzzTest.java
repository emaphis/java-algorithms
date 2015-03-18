package katas_test;

import static org.junit.Assert.*;
import katas.FizzBuzz;

import org.junit.Test;

public class FizzBuzzTest {

	@Test 
	public void testCanCreateFizzBuzz() {
		assertNotNull(new FizzBuzz());
	}
	
	@Test
	public void testOne() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.number(1));
		assertEquals("2", fizzBuzz.number(2));
		assertEquals("4", fizzBuzz.number(4));
		assertEquals("11", fizzBuzz.number(11));
	}
	
	@Test
	public void testThree() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.number(3));
		assertEquals("Fizz", fizzBuzz.number(6));
		assertEquals("Fizz", fizzBuzz.number(18));
	}
	
	@Test
	public void testFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.number(5));
		assertEquals("Buzz", fizzBuzz.number(10));
		assertEquals("Buzz", fizzBuzz.number(25));
	}
	
	@Test
	public void testFifteen() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.number(15));
		assertEquals("FizzBuzz", fizzBuzz.number(30));
		assertEquals("FizzBuzz", fizzBuzz.number(75));
	}
	
}

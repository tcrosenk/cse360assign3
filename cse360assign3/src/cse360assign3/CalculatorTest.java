package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void testGetTotal() {
		Calculator testCalc = new Calculator();
		int test = testCalc.getTotal();
		
		assertEquals(0, test);
	}
	
	@Test
	public void testAdd() {
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		
		assertEquals(5, testCalc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(3);
		
		assertEquals(-3, testCalc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		testCalc.multiply(6);
		
		assertEquals(30, testCalc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator testCalc = new Calculator();
		testCalc.add(10);
		testCalc.divide(3);
		
		assertEquals(3, testCalc.getTotal());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator testCalc = new Calculator();
		testCalc.add(10);
		testCalc.divide(0);
		
		assertEquals(0, testCalc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCalculator() {
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}
}

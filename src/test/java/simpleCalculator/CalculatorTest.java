/**
 * 
 */
package simpleCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Stephen.Mailey
 *
 */
public class CalculatorTest {
	Calculator calculator;

	/**
	 * @throws java.lang.Exception
	 * calculator object reference initialized at the beginning of each test.
	 */
	@Before
	public void setUp() throws Exception {
		 calculator = new Calculator(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void additionOfTwoNumbersTest() {
		//Calculator calculator = new Calculator(10); - Refactored code & moved object to setUp()
		calculator.add(5);
		assertEquals(15, calculator.getValue());	
	}
	
	@Test
	public void subtractionOfTwoNumbersTest() {
		//Calculator calculator = new Calculator(10);  - Refactored code & moved object to setUp()
		calculator.subtract(7);
		assertEquals(3, calculator.getValue());	
	}
	
	@Test
	public void multiplicationOfTwoNumbersTest() {
		//Calculator calculator = new Calculator(10);  - Refactored code & moved object to setUp()
		calculator.multiply(10);
		assertEquals(100, calculator.getValue());	
	}
	
	@Test
	public void divisionOfTwoNumbersTest() {
		//Calculator calculator = new Calculator(10);  -  Refactored code & moved object to setUp()
		calculator.divide(2);
		assertEquals(5, calculator.getValue());
	}
	
	@Test
	public void squareOfTwoNumbersTest() {
		Calculator calculator = new Calculator();
		calculator.square(7);
		assertEquals(49, calculator.getValue());
	}

}

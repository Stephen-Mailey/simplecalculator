/**
 * 
 */
package simpleCalculator;

/**
 * @author Stephen.Mailey
 *
 */
public class Calculator {
	
	private int value;

    public Calculator(int value) {
        this.value = value;     
    }
    
    public Calculator() {
    	this.value = 0;
    }
    
    /**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
    
	/**
	 * @param adds the values together
	 */
	public void add(int number) {
    	this.value += number;
    }
    
	/**
	 * @param subtracts the values 
	 */
	public void subtract(int number) {
		this.value -= number;
	}
	/**
	 * @param multiplys the values 
	 */
	public void multiply(int number) {
		this.value *= number;
	}
	/**
	 * @param divides the values 
	 */
	public void divide(int number) {
		this.value /= number;
	}
	/**
	 * @param squares the int number provided as a parameter
	 */
	public void square(int number) {
		this.value = number * number;
	}

}

/** Calculator class that will perform simple arithmetic operations on a total value.
 * 
 * @author Trevor Rosenkilde
 * @version Feb 21, 2016
 * 
 */
package cse360assign3;

public class Calculator {

	private int total;
	
	/** Constructor that initializes total to be equal to 0 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** getTotal will return the current value of total
	 * 
	 * @return the total value
	 */
	public int getTotal () {
		return total;
	}
	
	/** Takes in a single integer to add to the total
	 * 
	 * @param value to be added to total
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** Takes a single integer to subtract from the total
	 * 
	 * @param value to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Takes a single integer to multiply the total by
	 * 
	 * @param value to multiple the total by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** Takes a single integer to divide the total by
	 * if it is zero, total is set to zero
	 * 
	 * @param value to divide the total by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total = total / value;
		}
	}
	
	/** It will return a string that has the history of operations performed
	 * 
	 * @return string of history of operations
	 */
	public String getHistory () {
		return "";
	}
}

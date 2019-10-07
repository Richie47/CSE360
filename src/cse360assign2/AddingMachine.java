/**
 * @author Richard McKinnon
 * CSE360 M 940am
 * Assignment #2
 * Description: AddingMachine performs basic arithmetic such as adding a subtraction, and a few other helper methods such as
 * retrieving the total, getting a toString() version of the number, and clearing the number. 
 *
 */
package cse360assign2;

import java.util.ArrayList;
/**
 * 
 * This class acts a machine that can add, subtract, retrieve the total, get a toString representation and clear the total
 */
public class AddingMachine {
	
	/*
	 *keep track of the current sum
	 */
	private int total;
	
	/*
	 *  tracker for the calculations. Use ArrayList to be able to have a dynamic size to not limit the amount of calculations we can do
	 */
	private ArrayList<String> tracker = new ArrayList<String>();
	
	/*
	 * Constructor for class AddingMachine
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		tracker.add("0"); // initialize the tracker list
	}
	
	/*
	 * gets the total amount
	 * @return the total
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * adds an arbitrary value to the total
	 * @param value an int to be added to total
	 */
	public void add (int value) {
		total += value;
		//add operation and current value to ArrayList
		tracker.add("+");
		tracker.add(Integer.toString(value));
	}
	
	/*subtracts an arbitrary value to the total
	 * @param value an integer to be subtracted from the total
	 */
	public void subtract (int value) {
		total -= value;
		//add operation and current value to ArrayList
		tracker.add("-");
		tracker.add(Integer.toString(value));
	}
	
	/*
	 * get a transaction counter of the operations performed
	 * @return the operations recorded in ArrayList tracker separated by spaces
	 */
	public String toString () {
		/**
		 * concatenates the given elements of the ArrayList 
		 * with the appropriate space. 
		 * If there is only one element the space is not added.
		 */
		return String.join(" ", tracker);
	}
	
	/*
	 * reset total back to 0, restart array and initialize with new total
	 */
	public void clear() {
		total = 0;
		tracker.clear(); //ArrayList tracker is now empty
		tracker.add("0");
	}
}

package cis35.assignment4;
/**
 * 
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 4
 * Due: July 25, 2021
 * Submitted: July 25, 2021
 *
 */
public class CargoShip extends Ship{
	
	private int capacity;

	public CargoShip(String name, int yearBuilt, int numberOfFloors, int capacity) {
		super(name, yearBuilt, numberOfFloors);
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Maximum capacity is " + capacity;
	}

	

}

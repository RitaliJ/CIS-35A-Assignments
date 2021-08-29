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
public class Ship {
	
	//fields
	private String name;
	private int yearBuilt;
	private int numberOfFloors;
	
	//no arg constructor
	
	public Ship(String name, int yearBuilt, int numberOfFloors) {
		this.name = name;
		this.yearBuilt = yearBuilt;
		this.numberOfFloors = numberOfFloors;
	}
	
	@Override
	public String toString() {
		return "The name of the ship is " + name + 
				". Built in " + yearBuilt + " with " + numberOfFloors + 
				" floors.";
	}
}

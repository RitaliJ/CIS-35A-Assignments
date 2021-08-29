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
public class CruiseShip extends Ship{
	
	private int maximumPassengers;
	private boolean hasPoolOrAmenities;
	
	
	public CruiseShip(String name, int yearBuilt, int numberOfFloors, int maximumPassengers, boolean hasPoolOrAmenities){
		super(name, yearBuilt, numberOfFloors);
		this.maximumPassengers = maximumPassengers;
		this.hasPoolOrAmenities = hasPoolOrAmenities;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Maximum passengers are " + 
	maximumPassengers + (hasPoolOrAmenities?". With amenities":". No amenities");
	}

}

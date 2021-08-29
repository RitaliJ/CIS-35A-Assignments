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
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Ship[] shipArray = new Ship[5];
		shipArray[0] = new Ship("Dreamliner", 2007, 3);
		shipArray[1] = new CruiseShip("Carnival", 2014, 5, 1000, true);
		shipArray[2] = new CargoShip("BoatLoad", 2001, 2, 10000);
		shipArray[3] = new CruiseShip("Royal Caribbean", 2016, 4, 700, false);
		shipArray[4] = new Ship("Titanic", 1912, 3);
		
		for (Ship s: shipArray) {
			System.out.println(s.toString());
		}
		
		ArrayList<Ship> shipList = new ArrayList<>(Arrays.asList(shipArray));
		System.out.println("Adding a ship");
		shipList.add(new CargoShip("CargoFargo", 1, 1999, 25000));
		
		for (Ship s: shipList) {
			System.out.println(s.toString());
		}
	}
}

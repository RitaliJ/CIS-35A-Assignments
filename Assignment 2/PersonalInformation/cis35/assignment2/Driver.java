/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 2
 * Due: July 11, 2021
 * Submitted: July 11, 2021
 */

package cis35.assignment2;

import java.util.Scanner;

public class Driver {
	/**
	 * Demonstrates the Person class
	 */
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		Person[] persons = new Person[3];
		
		for(int i = 0; i < persons.length; i++){
			persons[i] = new Person();
			d.readInput(persons[i]);
			d.printData(persons[i]);
			System.out.println();
			
		}
		
	}
	
	public void readInput(Person p){
		Scanner scan = new Scanner(System.in);
		//Collect information for Person 2 and update values using setters
		System.out.print("Enter Person's name: ");
		p.setName(scan.nextLine());
		System.out.print("Enter Person's address: ");
		p.setAddress(scan.nextLine());
		System.out.print("Enter Person's age: ");
		p.setAge(scan.nextInt());
		//use next line to complete input from line		
		scan.nextLine();
		System.out.print("Enter Person's phone number: ");
		p.setPhoneNumber(scan.nextLine());
						
	}
	
	public void printData(Person p) {
		//Display information using getters
		System.out.println();
		System.out.println("Here is the personal information. \t Name: " + p.getName() + "\t Address: " 
		+ p.getAddress() + "\t Age: " + p.getAge() + "\t Phone Number: " + p.getPhoneNumber());
	}


}

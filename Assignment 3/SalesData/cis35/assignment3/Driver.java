package cis35.assignment3;

import java.util.Scanner;

/**
 * Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 3
 * Due: July 18, 2021
 * Submitted: July 18, 2021
 */

public class Driver {

	public static void main(String[] args) {
		// Test the program
		
		FileIO a1 = new FileIO("Salesdat.txt");
		Franchise f = a1.readData();
		
		Scanner scan = new Scanner(System.in);
		
		//Use try catch to detect if user wants to terminate the program
		
		try {
			while(true) { 
				System.out.println("Welcome! Which store would you like to look at? "
						+ "Enter an integer from 1 to 6. \nTo exit the program at any time, type # and press enter.");
				Integer store = Integer.parseInt(scan.nextLine());
				
				if(store < 1 || store > 6) {
					System.out.println("Invalid Store");
					continue;
					//continue to ask the user for a different, valid store 
				}
				//decrease store by 1 to correspond with array positions
				store -= 1;
				printMenu();
				//collect char from Scanner
				char option = (scan.nextLine().toUpperCase()).charAt(0);
				//get store from franchise and print out requested information
				f.getStores(store).print(option);
			}
		}catch(NumberFormatException e){
			//if there is NumberFormatException then user wants to end program
			System.out.println("Thank you for using the program. Bye!");
		}finally {
			scan.close();
		}
		
	}
	
	private static void printMenu(){
		System.out.println();
		System.out.println("What information would you like to see for this store?");
		System.out.println("Type 'A' to view the total sales for each week.");
		System.out.println("Type 'B' to view the average daily sales for each week.");
		System.out.println("Type 'C' to view the total sales for all the weeks.");
		System.out.println("Type 'D' to view the average weekly sales.");
		System.out.println("Type 'E' to find the week with the highest amount in sales.");
		System.out.println("Type 'F' to find the week with the lowest amount in sales.");
		System.out.println("Type 'G' to view all of the above values.");
	}
	
	

}

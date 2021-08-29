package cis35.assignment3;
import java.io.*;
import java.util.*;

/**
 * Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 3
 * Due: July 18, 2021
 * Submitted: July 18, 2021
 */

public class FileIO {
	//fields and their defaults
	private String fname = null;
	private boolean DEBUG = false;
	
	//FileIO constructor
	//overrides default and sets fname to the file name passed to it 
	public FileIO(String fname) {
		this.fname = fname;
	}

	public Franchise readData() {
		Franchise a1 = null;
		//declare counter variable to count lines read
		int counter = 0;
		try {
			//create FileReader and BufferedReader
			FileReader file = new FileReader(fname);
			BufferedReader buff = new BufferedReader(file);
			String temp;
			//create boolean eof to determine if reader has reached end of file
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				if (line == null)
					//if the line contains nothing then the reader is at the end of file 
					//and the while loop is exited.
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line);
					if (counter == 1) {
						//when the reader reads the first line, it should parse the value into Integer
						//initialize and assign a Franchise using this value as the length of the array
						temp = line;
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					if (counter == 2)
						; //ignore whatever is read in line 2
					if (counter > 2) {
						//for lines 3 and above
						//build a separate store in the franchise using the current line as its data
						  	int x = buildStore(a1, (counter-3), line);
							if (DEBUG)
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								a1.getStores(counter-3).printData();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		//create StringTokenizer using the line read
		StringTokenizer st = new StringTokenizer(temp);
		//while there are more tokens to read, read token as float
		//set sale for each weekday intersection using the sale read
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 s1 = st.nextToken();
		         sale = Float.parseFloat(s1);
	        	 tstore.setSaleForWeekdayIntersection(week, day, sale);
	         }
	         week++;
	    }
		a1.setStores(tstore, counter);
		//set store in franchise after its data has been added
	    return week; 
	}
}

package cis35.assignment3;

/**
 * Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 3
 * Due: July 18, 2021
 * Submitted: July 18, 2021
 */

public class Store {
	private float salesbyweek[][];

	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	void setSaleForWeekdayIntersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	//print method to print out the sales array for this store
	public void printData() {
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 7; j++){
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//float[] getsalesforentireweek(int week)
	public float[] getSalesForEntireWeek(int week) {
		return salesbyweek[week];
	}
	
	// float getsaleforweekdayintersection(int week, int day)
	public float getSaleForWeekdayIntersection(int week, int day) {
		return salesbyweek[week][day];
	}
	
	// business methods
	
	// a. total sales for week
	public float totalSalesForWeek(int week) {
		float[] salesForWeekPerDay= getSalesForEntireWeek(week);
		float totalSalesForWeek = 0;
		for(int i = 0; i < 7; i++) {
			totalSalesForWeek += salesForWeekPerDay[i];
		}
		return totalSalesForWeek;
	}
	// b. avg sales for week
	public float avgSalesForWeek(int week) {
		return totalSalesForWeek(week)/7;
	}
	
	// c. total sales for all weeks
	public float totalSalesForAllWeeks() {
		float totalSalesForAllWeeks = 0;
		for (int week = 0; week < 5; week++){
			totalSalesForAllWeeks += totalSalesForWeek(week);
		}
		return totalSalesForAllWeeks;
	}
	
	// d. average weekly sales
	public float averageWeeklySales() {
		return totalSalesForAllWeeks()/5;
	}
	
	// e. week with highest sale amt
	public int weekWithHighestSaleAmt() {
		float[] weekSales = new float[5];
		int weekMax = 0;
		for(int week = 0; week < 5; week++) {
			weekSales[week] = totalSalesForWeek(week);
			if(week > 0) {
				if(weekSales[week] > weekSales[weekMax]) {
					weekMax = week;
				}
			}
		}
		return weekMax;
	}
	
	// f. week with lowest sale amt
	public int weekWithLowestSaleAmt() {
		float[] weekSales = new float[5];
		int weekMin = 0;
		for(int week = 0; week < 5; week++) {
			weekSales[week] = totalSalesForWeek(week);
			if(week > 0) {
				if(weekSales[week] < weekSales[weekMin]) {
					weekMin = week;
				}
			}
		}
		return weekMin;
	}
	
	
	// analyze results 
	//call a through f
	public void analyzeResults() {
		
		for(int week = 0; week < 5; week++) {
			System.out.println("The total sales for week " + (week + 1)
					+ " are: " + totalSalesForWeek(week));
		}
		System.out.println();
		
		for(int week = 0; week < 5; week++) {
			System.out.println("The average daily sales for week " + (week + 1)
					+ " are: " + avgSalesForWeek(week));
		}
		System.out.println();	
		System.out.println("The total sales for all weeks are: " + totalSalesForAllWeeks());
		System.out.println("The average weekly sales are: " + averageWeeklySales());
		System.out.println("The week with the highest sales amount is Week " + (weekWithHighestSaleAmt() + 1));
		System.out.println("The week with the lowest sales amount is Week " + (weekWithLowestSaleAmt() + 1));
		System.out.println();	
		
	}
	
	// print() for different requests
	//use switch case to identify what information the user wants
	public void print(char letter) {
		letter = Character.toUpperCase(letter);
		switch(letter) {
		case 'A':
			for(int week = 0; week < 5; week++) {
				System.out.println("The total sales for week " + (week + 1)
						+ " are: " + totalSalesForWeek(week));
			}
			break;
		case 'B':
			for(int week = 0; week < 5; week++) {
				System.out.println("The average daily sales for week " + (week + 1)
						+ " are: " + avgSalesForWeek(week));
			}
			break;
		case 'C':
			System.out.println("The total sales for all weeks are: " + totalSalesForAllWeeks());
			break;
		case 'D':
			System.out.println("The average weekly sales are: " + averageWeeklySales());
			break;
		case 'E':
			System.out.println("The week with the highest sales amount is Week " + (weekWithHighestSaleAmt() + 1));
			break;
		case 'F':
			System.out.println("The week with the lowest sales amount is Week " + (weekWithLowestSaleAmt() + 1));
			break;
		case 'G':
			analyzeResults();
			break;
		case '#':
			System.out.println("Thank you for using the program. Bye!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println();
	}
}

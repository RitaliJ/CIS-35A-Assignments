package cis35.assignment3;

/**
 * Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 3
 * Due: July 18, 2021
 * Submitted: July 18, 2021
 */

public class Franchise {
	private Store stores[];
	
	//constructor
	public Franchise(int num) {
			stores = new Store[num];
	}
	
	//getter
	public Store getStores(int i) {
		return stores[i];
	}
	
	//setter
	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores(){
		return stores.length;
	}
	
}

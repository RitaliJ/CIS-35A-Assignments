/**
 * @author Ritali Jain
 * CIS 35A.62AZ (CRN: 13083) 
 * Assignment 2
 * Due: July 11, 2021
 * Submitted: July 11, 2021
 */

package cis35.assignment2;

/**
 * Class used in PersonalInfoDemo.java
 */
public class Person {
	
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	//default constructor
	public Person() {
	}
	
	//constructor
	public Person(String name, String address, int age, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	//Write getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

package cis35.textbook.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean isPrime;
		for(int i = 1; i <= n; i++) {
			isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

	}

}

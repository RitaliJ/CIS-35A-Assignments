package cis35.textbook.practice;

import java.util.Scanner;

public class AreaTriangleGivenVertices {

	public static void main(String[] args) {
		System.out.println("Compute the area of a triangle given its vertices");
		int[] vertexA = new int[3];
		int[] vertexB = new int[3];
		int[] vertexC = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter vertex A coordinates separated by a space: ");
		for(int i = 0; i < 3; i++) {
			vertexA[i] = scan.nextInt();
		}
		scan.nextLine();
		System.out.print("Enter vertex B coordinates separated by a space: ");
		for(int i = 0; i < 3; i++) {
			vertexB[i] = scan.nextInt();
		}
		scan.nextLine();
		System.out.print("Enter vertex C coordinates separated by a space: ");
		for(int i = 0; i < 3; i++) {
			vertexC[i] = scan.nextInt();
		}
		scan.nextLine();
		scan.close();
		
		int[] vectorAB = {vertexB[0] - vertexA[0], vertexB[1] - vertexA[1], vertexB[2] - vertexA[2]};
		int[] vectorAC = {vertexC[0] - vertexA[0], vertexC[1] - vertexA[1], vertexC[2] - vertexA[2]};
		
		int[] v = crossProduct(vectorAB, vectorAC);
		printList(v);
		System.out.println("Area is " + (computeMagn(v)/2));

	}
	
	public static void printList(int[] list) {
		for(int i = 0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] crossProduct(int[] AB, int[]AC) {
		int i = AB[1]*AC[2] - AB[2]*AC[1];
		int j = -(AB[0]*AC[2] - AB[2]*AC[0]);
		int k = AB[0]*AC[1] - AB[1]*AC[0];
		int [] crossPvector = {i, j, k};
		return crossPvector;
	}
	
	public static double computeMagn(int[] a) {
		double sumOfSquaredTerms = 0;
		for(int i=0; i<a.length;i++) {
			sumOfSquaredTerms += Math.pow(a[i], 2);
		}
		System.out.println("Sum of squares " + sumOfSquaredTerms); 
		return Math.sqrt(sumOfSquaredTerms);
	}

}

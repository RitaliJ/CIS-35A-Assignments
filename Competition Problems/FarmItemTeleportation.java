/*
 * 
 * Farmer John's farm is built along a single long straight road, so any location on his farm can be described simply using its position along this road (effectively a point on the number line). A teleporter is described by two numbers x and y, where items brought to location x can be instantly transported to location y, or vice versa.

Farmer John wants to transport items from location a to location b, and he has built a teleporter that might be helpful during this process (of course, he doesn't need to use the teleporter if it doesn't help). Please help him determine the minimum amount of total distance he needs to haul the items using his tractor.

Input Format

The first and only line of input contains four space-separated integers: a and b, describing the start and end locations, followed by x and y, describing the teleporter.

Constraints

All positions are integers in the range 0...100, and they are not necessarily distinct from each-other.

Output Format

Print a single integer giving the minimum distance Farmer John needs to haul items in his tractor.

Sample Input 0

3 10 8 2
Sample Output 0

3
Explanation 0

In this example, the best strategy is to haul the items from position 3 to position 2, teleport it to position 8, then haul it to position 10. The total distance requiring the tractor is therefore 1 + 2 = 3.

 */

package cis35.textbook.practice;

import java.util.Scanner;

public class FarmItemTeleportation {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        String[] info = scan.nextLine().split(" ");
	        int a = Integer.parseInt(info[0]);
	        int b = Integer.parseInt(info[1]);
	        int x = Integer.parseInt(info[2]);
	        int y = Integer.parseInt(info[3]);
	        scan.close();
	        
	        int rawHaul = Math.abs(b-a);
	        int teleportHaul = 0;
	        if(Math.abs(x-b) == Math.abs(y-b)){
	            if(Math.abs(x-a) < Math.abs(y-a)){
	                teleportHaul = Math.abs(x-a) + Math.abs(y-b);
	            }else{
	                teleportHaul = Math.abs(y-a) + Math.abs(x-b);
	            }
	        }else if(Math.abs(x-b) < Math.abs(y-b)){
	            teleportHaul = Math.abs(x-b) + Math.abs(y-a);
	        }else{
	            teleportHaul = Math.abs(y-b) + Math.abs(x-a);
	        }
	        
	        if(rawHaul < teleportHaul){
	            System.out.println(rawHaul);
	        }else{
	            System.out.println(teleportHaul);
	        }
	        
	        
	    }
}

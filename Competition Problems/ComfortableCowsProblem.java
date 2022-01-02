/*
 * Farmer John's pasture can be regarded as a large 2D grid of square "cells" (picture a huge chessboard). Initially, the pasture is empty.

Farmer John will add N cows to the pasture one by one. The ith cow will occupy a cell (xi,yi) that is distinct from the cells occupied by all other cows.

A cow is said to be "comfortable" if it is horizontally or vertically adjacent to exactly three other cows. Farmer John is interested in counting the comfortable cows on his farm. For each i in the range 1...N, output the total number of comfortable cows after the ith cow is added to the pasture.

Input Format

The first line contains a single integer N. Each of the next N lines contains two space-separated integers, indicating the (x,y) coordinates of a cow's cell. It is guaranteed that all these cells are distinct.

Constraints

0≤xi,yi≤1000; 1≤N≤10^5

Output Format

The ith line of output should contain the total number of comfortable cows after the first i cows are added to the pasture.

Sample Input 0

8
0 1
1 0
1 1
1 2
2 1
2 2
3 1
3 2
Sample Output 0

0
0
0
1
0
0
1
2
Explanation 0

After the first four cows are added, the cow at (1,1) is comfortable.

After the first seven cows are added, the cow at (2,1) is comfortable.

After the first eight cows are added, the cows at (2,1) and (2,2) are comfortable.
 * 
 */


package cis35.textbook.practice;

import java.util.*;

public class ComfortableCowsProblem {
    
    static boolean[][] cows = new boolean[1001][1001];
    
    public static void main(String[] args) {
        int comfortableCows = 0;
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        int surroundingComfortPrevious = 0;
        int surroundingComfortAfter = 0;
        
        for(int i = 1; i <= n; i++){
            surroundingComfortPrevious = 0;
            surroundingComfortAfter = 0;
            
            String[] coordinates = scan.nextLine().split(" ");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);
            
            //check if surrounding cows were comfortable before new cow is added
            ArrayList<Integer> x_indexes = createIndexes(x);
            ArrayList<Integer> y_indexes = createIndexes(y);
            for(int a : x_indexes){
                if(isComfortableCow(a, y)){
                    surroundingComfortPrevious += 1;
                }
            }
            for(int b : y_indexes){
                if(isComfortableCow(x, b)){
                    surroundingComfortPrevious += 1;
                }
            }
        
            //add new cow
            cows[x][y] = true;
            //if cow is comfortable, increment by one
            if(isComfortableCow(x, y)){
                comfortableCows += 1;
            }
            
            //check if surrounding cows are comfortable after new cow is added
            for(int a : x_indexes){
                if(isComfortableCow(a, y)){
                    surroundingComfortAfter += 1;
                }
            }
            for(int b : y_indexes){
                if(isComfortableCow(x, b)){
                    surroundingComfortAfter += 1;
                }
            }
            int difference = surroundingComfortAfter - surroundingComfortPrevious;

            comfortableCows += difference;
            System.out.println(comfortableCows);
            
        }
        scan.close();
        
    }
    
    public static boolean isComfortableCow(int row, int column){
        if(!cows[row][column]){
            return false;
        }
        int adjacentCows = 0;
        ArrayList<Integer> x_indexes = createIndexes(row);
        ArrayList<Integer> y_indexes = createIndexes(column);
        
        //check up and down
        for(int a : x_indexes){
            if(cows[a][column]){
                adjacentCows += 1;
            }
        }
        
        //check side and side
        for(int b : y_indexes){
            if(cows[row][b]){
                adjacentCows += 1;
            }
        }
        return adjacentCows == 3;
        
        
    }
    
    public static ArrayList<Integer> createIndexes(int z){
        ArrayList<Integer> indexes = new ArrayList<>();

        if(z!=0){ 
            indexes.add(z-1);
        }
        if(z!=1000){
            indexes.add(z+1);
        }
        return indexes;
    }
}

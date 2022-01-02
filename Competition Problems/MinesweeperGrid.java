/*
 * In Minesweeper, there is a grid in which there are bombs located on specific squares. All of the other squares are assigned a number that indicates the number of bombs adjacent to it. Your task is to, given the positions of the bombs, complete the grid.

Input Format

Line 1: N (the number of rows) and M (the number of columns) separated by a space

Lines 2...N+1: M characters separated by spaces displaying B for a space with a bomb or * otherwise

Constraints

N < 100, M < 100

Output Format

Lines 1...N: M characters, separated by spaces, with B for a bomb-containing square or a number indicating the number of bombs the square is adjacent to if the square doesn't contain a bomb.

Sample Input 0

6 6
* * * * * *
* B * B * B
B * B * B *
B B B B B B
B * * * B *
* * B * * *
Sample Output 0

0 1 0 1 0 1
2 B 3 B 3 B
B 4 B 4 B 3
B B B B B B
B 2 2 2 B 2
1 1 B 1 1 0
Explanation 0

The 6x6 grid contains bombs on squares containing B's. The output keeps the Bs and fills in the squares with *'s with numbers indicating the number of bombs they are adjacent to (note that "adjacent" squares are not diagonals).
 * 
 */



package cis35.textbook.practice;

import java.util.*;

public class MinesweeperGrid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
        Scanner scan = new Scanner(System.in);
        String[] info = scan.nextLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int m = Integer.parseInt(info[1]);
        String[][] grid = new String[n][m];
        for(int i = 0; i < n; i++){
            String[] rowData = scan.nextLine().split(" ");
            for(int j = 0; j < m; j++){
                grid[i][j] = rowData[j];
            }
        }
        scan.close();
        
        ArrayList<Integer> iIndexes = new ArrayList<Integer>();
        ArrayList<Integer> jIndexes = new ArrayList<Integer>();
        int numBombs = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                numBombs = 0;
                if(grid[i][j].equals("B")){
                    System.out.print("B ");
                    continue;
                }else{
                    iIndexes.add(i+1);
                    iIndexes.add(i-1);
                    if(i == 0){
                        iIndexes.remove(new Integer(i-1));
                    }else if(i == n-1){
                        iIndexes.remove(new Integer(i+1));
                    }
                    
                    jIndexes.add(j+1);
                    jIndexes.add(j-1);
                    if(j == 0){
                        jIndexes.remove(new Integer(j-1));
                    }else if(j == (m-1)){
                        jIndexes.remove(new Integer(j+1));
                    }
                    
                    for(int a : iIndexes){
                       if(grid[a][j].toString().equals("B")){
                            numBombs += 1;
                        } 
                    }
                    for(int b : jIndexes){
                       if(grid[i][b].toString().equals("B")){
                            numBombs += 1;
                        }
                    }
                    System.out.print(numBombs + " ");
                    iIndexes.clear();
                    jIndexes.clear();
                }
            }
            System.out.println();
        }
    
    }
}
/******************************************************************************
 * 
Given a binary matrix where 1 represents land and 0 water, calculate the perimeter of the island.
The island has no lakes (water inside land) and is completely surrounded by water.
Each land cell adds 4 to the perimeter, but it shares an edge with another land cell - reduce by 1 for each such shared side.

Input1:
grid = [[0, 1, 0, 0], [1, 1, 1, 0], [0,1, 0, 0], [1, 1, 0, 0]]
Output 1:
16

Input2:
grid - [[1, 1], [1, 1]]
output2:
8

*******************************************************************************/

import java.util.*;

public class Main
{
	public static int findPerimeter(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int perimeter = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    perimeter += 4;
                    if(i > 0 && arr[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if(j > 0 && arr[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
    
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n =  sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        
        int[][] grid = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
            System.out.println("");
        }*/
        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println(findPerimeter(grid));
    }
}

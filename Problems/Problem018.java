/******************************************************************************

Counting Islands in a 2D Grid:
Count the number of islands in a binary grid (1 = land, 0 = water).
Input: [[1,1,1,1,0],
        [1,1,0,1,0],
        [1,1,0,0,0],
        [0,0,0,0,0]]
Output: 1

*******************************************************************************/

public class Main
{
    public static void dfs(int[][] grid, int i, int j) {
        int row = grid.length, col = grid[0].length;
        if(i < 0 || j < 0 || i > row || j > col || grid[i][j] == 0)     return;
        grid[i][j] = 0;
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        
    }
    public static int numberOfIslands(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int[][] grid = {
            {1, 1, 1, 1, 0},
            {1, 1, 0, 1, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println(numberOfIslands(grid));
	}
}

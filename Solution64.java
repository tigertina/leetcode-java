/**
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
*/
public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
		if (m == 0)
			return 0;
		int n = grid[0].length;
		if (n == 0)
			return 0;
		int[][] res = new int[m][n];
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += grid[i][0];
			res[i][0] = sum;
		}
		sum = 0;
		for (int j = 0; j < n; j++) {
			sum += grid[0][j];
			res[0][j] = sum;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
			}
		}
		return res[m - 1][n - 1];
    }
}
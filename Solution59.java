/**
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,
You should return the following matrix:

[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]

*/
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
		rec(matrix,0,0,n,n,1);
		return matrix;
    }

    public void rec(int[][] matrix, int x, int y, int rows, int cols,
			int start) {
		if (rows <= 0 || cols <= 0)
			return;
		// first line
		for (int i = 0; i < cols; i++)
			matrix[x][y + i] = start++;
		// right column
		for (int i = 1; i < rows - 1; i++) {
			matrix[x + i][y + cols - 1] = start++;
		}
		// down row
		if (rows > 1) {
			for (int i = cols - 1; i >= 0; i--) {
				matrix[x + rows - 1][y + i] = start++;
			}
		}
		// left column
		if (cols > 1) {
			for (int i = rows - 2; i > 0; i--) {
				matrix[x + i][y] = start++;
			}
		}
		rec(matrix, x + 1, y + 1, rows - 2, cols - 2, start);
	}
}
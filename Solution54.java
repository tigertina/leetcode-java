/**
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

You should return [1,2,3,6,9,8,7,4,5]. 
*/

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return res;
		rec(matrix, 0, 0, matrix.length, matrix[0].length, res);
		return res;
	}

	public void rec(int[][] matrix, int x, int y, int rows, int cols,
			List<Integer> ret) {
		if (rows <= 0 || cols <= 0)
			return;
		// first line
		for (int i = 0; i < cols; i++)
			ret.add(matrix[x][y + i]);
		// right column
		for (int i = 1; i < rows - 1; i++) {
			ret.add(matrix[x + i][y + cols - 1]);
		}
		// down row
		if (rows > 1) {
			for (int i = cols - 1; i >= 0; i--) {
				ret.add(matrix[x + rows - 1][y + i]);
			}
		}
		// left column
		if (cols > 1) {
			for (int i = rows - 2; i > 0; i--) {
				ret.add(matrix[x + i][y]);
			}
		}
		rec(matrix, x + 1, y + 1, rows - 2, cols - 2, ret);
	}
}
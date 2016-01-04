/**
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,

There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]

The total number of unique paths is 2.

Note: m and n will be at most 100.
*/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        
        int n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        if(n == 1 && m == 1 && obstacleGrid[0][0] == 1)
            return 0;
        
        for(int i = 0; i < n ;i++){
            if(obstacleGrid[0][i]==1)
                break;
            res[0][i] = 1;
        }
        for(int i = 0; i < m ; i++){
            if(obstacleGrid[i][0]==1)
                break;
            res[i][0] = 1;
        }
        for(int i = 1; i < m ; i++){
            for(int j = 1; j < n ; j++){
                if(obstacleGrid[i][j] == 1){
                    res[i][j] = 0;
                    continue;
                }
                if(obstacleGrid[i-1][j] == 1)
                    res[i][j] = res[i][j-1];
                else if(obstacleGrid[i][j-1] == 1)
                    res[i][j] = res[i-1][j];
                else 
                    res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}
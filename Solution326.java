/**
 Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion? 
*/

public class Solution {
    private static final double epsilon = 10e-15;

    public boolean isPowerOfThree(int n) {
        if(0 == n)
            return false;
        double res = Math.log(n)/Math.log(3);
        //return Math.floor(res) == Math.ceil(res);
        return Math.abs(res - Math.round(res)) < epsilon;
    }
}
/**
For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
  */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i = 0;
        int ans = 0;
        while(i<32){
            ans <<=1;
            ans |= (n&1);
            n >>=1;
            i++;
        }
        return ans;
    }
}
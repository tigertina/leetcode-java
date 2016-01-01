/**
 Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number.

Hint:

    The naive approach is to call isUgly for every number until you reach the nth one. Most numbers are not ugly. Try to focus your effort on generating only the ugly ones.
    An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.
    The key is how to maintain the order of the ugly numbers. Try a similar approach of merging from three sorted lists: L1, L2, and L3.
    Assume you have Uk, the kth ugly number. Then Uk+1 must be Min(L1 * 2, L2 * 3, L3 * 5).

 */
public class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		l1.add(1);
		l2.add(1);
		l3.add(1);
		int next = 0;
		for (int i = 0; i < n; i++) {
			next = Math.min(Math.min(l1.get(0), l2.get(0)), l3.get(0));
			if (l1.get(0) == next)
				l1.remove(0);
			if (l2.get(0) == next)
				l2.remove(0);
			if (l3.get(0) == next)
				l3.remove(0);
			l1.add(next * 2);
			l2.add(next * 3);
			l3.add(next * 5);
		}
		return next;
    }
}
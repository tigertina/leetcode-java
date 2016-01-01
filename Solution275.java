/**
public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0)
			return 0;
		int len = citations.length;
		int low = 0, high = citations.length - 1, mid = 0;
		while (low <= high) {
			mid = low + (high-low)/2;
			if(citations[mid]==len-mid)
				return len-mid;
			else if (citations[mid]>len-mid)
				high = mid-1;
			else low = mid+1;
		}
		return len -low;
    }
}
 */
 public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0)
			return 0;
		int len = citations.length;
		int low = 0, high = citations.length - 1, mid = 0;
		while (low <= high) {
			mid = low + (high-low)/2;
			if(citations[mid]==len-mid)
				return len-mid;
			else if (citations[mid]>len-mid)
				high = mid-1;
			else low = mid+1;
		}
		return len -low;
    }
}
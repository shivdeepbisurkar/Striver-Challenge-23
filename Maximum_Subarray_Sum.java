import java.util.* ;
import java.io.*; 
//Time complexity: O(n);
//Space Complexity: O(1)
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		if(arr.length==0)
			return 0L;
		long sum=0;
		long max=Long.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			max=Math.max(max,sum);
			if(sum<0)
				sum=0;
		}
		if(max<0)
			return 0;
		return max;
	}

}

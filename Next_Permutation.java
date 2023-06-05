import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;
//Time complexity: O(n)
//Space complexity: O(1)
public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int high=permutation.size();
		if(high<=1)
			return permutation;
		int i=0;
		for(i=high-2;i>=0;i--){
			if(permutation.get(i)<permutation.get(i+1))
				break;
		}
		int j=high-1;
		if(i>=0){
		
			while(j>=0 && permutation.get(j)<=permutation.get(i)){
				j--;
			}
			int tmp=permutation.get(i);
			permutation.set(i,permutation.get(j));
			permutation.set(j,tmp);
		}

		int low=i+1;
		int h=high-1;

		while(low<=h){
		int tmp=permutation.get(low);
		permutation.set(low,permutation.get(h));
		permutation.set(h,tmp);
		low++;
		h--;
		}
	
		return permutation;
	}
}

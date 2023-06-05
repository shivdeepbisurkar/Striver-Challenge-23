import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
//Time complexity:O(n)
//Space complexity:O(1)
public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            max=Math.max(max,prices.get(i)-min);
            min=Math.min(min,prices.get(i));

        }
        if(max<0)
            return 0;
        return max;
    }
}
import java.util.* ;
import java.io.*; 
//Time Complexity:
//Space Complexity:
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int tmp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=tmp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    tmp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=tmp;
                    high--;
                    break;
            }
        }
    }
}
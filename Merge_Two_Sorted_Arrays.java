import java.io.*;
import java.util.* ;
//Time complexity: O(m+n)
//Space complexity: O(m+n)
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int arr[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]>=arr2[j]){
                arr[k++]=arr2[j++];
            }
            else{
                arr[k++]=arr1[i++];
            }
        }
        while(i<m){
            arr[k++]=arr1[i++];
        }
        while(j<n){
            arr[k++]=arr2[j++];
        }
        return arr;
    }
}

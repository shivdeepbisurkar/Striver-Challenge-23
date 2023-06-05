import java.io.*;
import java.util.* ;

import java.util.ArrayList;
//Time complexity: O(n)
//Space Complexity: O(1)
public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Map<Integer,Integer> m=new HashMap<>();
        if(n==1)
            return arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(!m.containsKey(arr.get(i))){
                m.put(arr.get(i),1);
            }
            else{
                return arr.get(i);
            }
        }
        return 0;
    }
}

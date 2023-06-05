import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;



import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> l=new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a.start-b.start);
            if(intervals.length ==0 ){

                return l;
            }
            int end=intervals[0].finish;
            int start=intervals[0].start;
            

                for(int j=0;j<intervals.length;j++){
                    if(end>=intervals[j].start ){
                        end=Math.max(end,intervals[j].finish);
                    }
                    else{
                        l.add(new Interval(start,end));
                        end=intervals[j].finish;
                        start=intervals[j].start;
                    }
                }
            
           l.add(new Interval(start,end));
        return l;
    }
}

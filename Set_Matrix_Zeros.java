import java.io.*;
import java.util.* ;
//Time complexity= O(n^2)
//Space complexity= O(1)
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int col=1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)
                col=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                     matrix[0][j]=0;

                }
            }
        }
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col==0)
                matrix[i][0]=0;
        }
    }

}
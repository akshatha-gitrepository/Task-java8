package task3;

import java.util.Arrays;
import java.util.Scanner;

public class DaigonalSumOfMatrix {
public static Integer sumMainDiagonal;
	public static Integer sumSecondaryDiagonal;


	public static void main(String[] args) {

		int[][] matrix = {
                {12, 54, 88},
                {23, 53, 12},
                {13, 11, 21}
        };
		
		//getDiagonalSum2(matrix);
		 getDiagonalSum(matrix,3);
        
    }

    public static void getDiagonalSum(int[][] matrix, int order) {
    	sumMainDiagonal = Arrays.stream(matrix)
                 .mapToInt(row -> row[Arrays.asList(matrix).indexOf(row)])
                 .sum();

    	 System.out.println("Sum of first diagonal :" + sumMainDiagonal);
    	 
          sumSecondaryDiagonal = Arrays.stream(matrix)
                 .mapToInt(row -> row[order - 1 - Arrays.asList(matrix).indexOf(row)])
                 .sum();
         
         System.out.println("Sum of second diagonal :" + sumSecondaryDiagonal);

         
    }
    
    
    public static void getDiagonalSum2(int[][] matrix) {
    	int n=matrix.length;
    	int m=matrix[0].length;
    	
    	int sum=0;
    	int sum1=0;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			if(i==j) {
    				sum= sum+matrix[i][j];
    			}
    		}
    	}
    	
    	System.out.println("Sum of the first diagonal :"+sum);
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			if(i+j==matrix.length-1) {
    				sum1= sum1+matrix[i][j];
    			}
    		}
    	}
    	System.out.println("Sum of the second diagonal :"+sum1);
    	
    }
}

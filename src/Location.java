

/*
 CIS 209: INTRO TO JAVA  
 CHAPTER 9 PROJECT 
 
 PROBLEM: 
 Design a class named Location for locating a maximum value 
 and its location in a two-dimensional array. 
 The class contains public data fields row, column, and maxValue that 
 store the maximum value and its indices in a two-dimensional array with 
 row and column as int types and maxValue as a double type.

Write the following method in the class that returns the location 
of the largest element in the two-dimensional array:

public static Location locateLargest(double[][] a)
  
 */
//DEBUG CODE DOESN'T PRINT OUT LARGEST ELEMENT  ONLY SECOND LARGEST ELEMENT  

import java.util.Scanner;

public class Location {

	//VARIABLES	
	private double maxValue;
	private int row;
	private int column;
    
	//MAIN METHOD
	public static void main(String[] args) {
            
		    //SCANNER SYSTEM INPUT
	        Scanner input = new Scanner(System.in);
	        //PRINT STATEMENT
	        System.out.print("Enter the number of rows and columns in the array: ");
	        //ROW INTEGER
	        int row = input.nextInt();
	        //COLUMN INTEGER
	        int column = input.nextInt();
	        //DOUBLE ARRAY ROW & COLUMN
	        double[][] m = new double[row][column];
            //PRINT LINE STATEMENT
	        System.out.println("Enter the array:");
	        //FOR STATEMENT M.LENGTH
	        for (int i = 0; i < m.length; i++) {
	        	//FOR STATEMENT: J SET TO 0
	            for (int j = 0; j < m[i].length; j++) {
	            	//M I AND J ROW AND COLUMN IN ARRAY
	                m[i][j] = input.nextDouble();
	            }
	        }
            //DECLARE LOCATION FIND LARGEST ELEMENT
	        Location location = Location.locateLargest(m);
            //PRINT LINE STATEMENT: MAX VALUE, ROW AND COLUMN LOCATIONS
	        System.out.println("The location of the largest element is "
	                + location.maxValue + " at (" + location.row + ", " + location.column + ")");
	    }
	  //LOCATTE LARGEST METHOD WITH DOUBLE ARRAY ARGUMENT
	  public static Location locateLargest(double[][] a) {
		    //DECLARE NEW LOCATION
            Location newLocation = new Location(); 
            //INT LOCATION SET TO 0
	        int[] location = new int[] { 0, 0 };
	        //NEW LOCATION MAX VALUE
	        newLocation.maxValue = a[0][0];
	        //NEW LOCATION ROW SET TO 0 
	        newLocation.row = 0; 
	        //NEW LOCATION COLUMN SET TO 0
	        newLocation.column = 0; 
	        //FOR LOOP A LENGTH
	        for (int i = 0; i < a.length; i++) {
                //FOR LOOP A[I] LENGTH 
	            for (int k = 0; k < a[i].length; k++) {
                    //IF A[i][k] GREATER THAN NEW LOCATION MAX VALUE
	                if (a[i][k] > newLocation.maxValue) {
	                	//NEW LOCATION ROW -- I
	                    newLocation.row = i; 
	                    //NEW LOCATION COLUMN -- K 
	                    newLocation.column = k; 
	                    //NEW LOCATION MAX VALUE I - K 
	                    newLocation.maxValue = a[i][k];
	                }

	            }
	        }
            //RETURN NEW LOCATION 
	        return newLocation;
	    }
}

//This program calculates the average of the non-negative integers
//and prints error if the user enters a negative value.
//
//Date: 5/7/21
//
//Written by: Shiven Bhardwaj
//
//Assignment19


import java.util.Scanner;

public class average{
    public static void main(){
        Scanner keyb = new Scanner(System.in);
        int x, y;
        double average;
        
        double total = 0;
        
        //Asking the user the number of values to be averaged
        System.out.println("Enter a number?");
        x = keyb.nextInt();
        
        // Asking the user to enter the numbers to be averaged
        try {
           for (int i = 1; i <= x; i++){ 
               System.out.println("Enter integer");
               y = keyb.nextInt();
               
               // Throwing an expection if an negative number is entered
               if(y < 0)
               throw new NegativeNumberException(y);
               
               //Adding the sum of integers to be averaged
               total += y;
               
           }
        
        }
        
        //Printing an error message and ending the program if a 
        //negative integer is entered by the user.
        
        catch (NegativeNumberException e){
            System.out.println(e.getNegativeNumber());
            System.out.println("Invalid number entered");
            System.exit(0);
       
        }
        
        //Calculating the average and printing it
        average = total/x;
        
        System.out.println("Total: " + total);
        System.out.println(); // Blank space for readablility
        
        System.out.println("Average: " + average);
        
        
       
        
        
        
    }
}
 
    

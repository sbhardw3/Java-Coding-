
/**
 * The program calculates the gross pay
 * Shiven bhardwaj
 * 02/03/2021
 */
import java.util.Scanner;

public class Payroll
{ 
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        // assigning variable 
        double SinglePay, CouplePay, ForChildren, GrossPay;
        
        
        SinglePay = 10;
        CouplePay = 15;
    
        
       
        //Input if the user is married or not. 
        //If married then user enter "1" and 
        //If single then user enters "0"
        System.out.println("Are you married or single");
        int status = keyb.nextInt();
        
        //Asking user how many children they have
        System.out.println("Number of children you have: ");
        int children = keyb.nextInt();
        
        //Input number of hours employee worked
        System.out.println("Number of hours worked: ");
        int hour = keyb.nextInt();
     
        
        // For the first four children there is increase in rate
        if (children >= 4)
        {
            SinglePay = SinglePay + 1;
            CouplePay = CouplePay + 1;
        }
        
        // Employee will get time and half after 40 hours
        if (hour >= 40)
        {
            SinglePay = SinglePay * 1.5;
            CouplePay = CouplePay * 1.5;
        }
            
      
        
        // Calculating gross pay of the employee
        
        if (status == 0)//For employees that are single
        {
        GrossPay = SinglePay * hour;
        System.out.println("Your pay is: $"  + GrossPay);
        }
        
        else if (status == 1)// For employees that are couples
        {
        GrossPay = CouplePay * hour;
        System.out.println("Your pay is: $" + GrossPay);
        }
          
        else //Invalid data entered
        System.out.println("Enter a valid value!");
        
        
        
        
    
    
   
       
    }
    
    

}

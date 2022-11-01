
/**
 * The program calculates the weekly income with income taxes 
 * Shiven bhardwaj
 * 02/10/2021
 */
import java.util.Scanner;
public class PayRoll2
{ 
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        // assigning variable 
        double SinglePay, CouplePay, ForChildren;
        
        
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
     
        
        // For the first four children there is increase in income
        if (children >= 4)
        {
            SinglePay = SinglePay + 1;
            CouplePay = CouplePay + 1;
        }
        
        // Employees will get time and half after 40 hours
        if (hour >= 40)
        {
            SinglePay = SinglePay * 1.5;
            CouplePay = CouplePay * 1.5;
        }
         
        // Calculating gross pay of the employees
        double GrossPay1 = SinglePay * hour;
        double GrossPay2 = CouplePay * hour;
        
       
       
        // Calculating the final pay by deducting the taxes from the income and printing it
        if (status == 0)//For employees that are single
      {
     
        if (GrossPay1 < 399.99)
        
        GrossPay1 = GrossPay1;
        
        else if (GrossPay1 < 399.99)
        
        GrossPay1 = GrossPay1 - GrossPay1 * 5/100;
        
        else if (GrossPay1 < 599.99)
        GrossPay1 = GrossPay1 - GrossPay1 * 8/100;
    
        else 
        GrossPay1 = GrossPay1 - GrossPay1 * 10/100;
        
        System.out.println("Your pay is: $" + GrossPay1);
        
      }
        
       
        else if (status == 1)// For employees that are couples
      {
       
        if (GrossPay2 < 300)
        
        GrossPay2 = GrossPay2;
         
        else if (GrossPay2 < 399.99)
        GrossPay2 = GrossPay2 - GrossPay2 * 5/100;
        
      
        else if (GrossPay2 < 599.99)
        GrossPay2 = GrossPay2 - GrossPay2 * 8/100;                                          
        
        else
        GrossPay2 = GrossPay2 - GrossPay2 * 10/100;
        
        System.out.println("Your pay is: $" + GrossPay2);
        
     
      }  else //Invalid data entered
        System.out.println("Enter a valid value!");
        
        
    
    
   
       
  }
    
    
}


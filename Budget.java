public class Budget {
    public static void main(String[] args){

        /*******Project 1 *******/

        /**This Program calculates the number of hours
         * a TA/Grader at CCI has to work to take out 
         * his/her living expenses with a saving of 
         * $100 each month
         * 
         * Author: Shiven Bhardwaj
         * 
         * Date: 2/11/2022
         */

         int rent = 625; //monthly apartment rent
         int internetBill = 27; //monthly internet bill
         int grocery = 250; //monthly grocery expense
         int funAllowance = 150; //funds to be used for leisure activities
         double wageRate = 10.0; //wage rate of the TA

         System.out.println("Monthly local apartment rent: " + rent);
         System.out.println("Monthly Internet Bill: " + internetBill);
         System.out.println("Monthly Grocery Bill: " + grocery);
         System.out.println("Montly funds for leisure activities: " + funAllowance);

         int TotalExpense = rent + internetBill + grocery + funAllowance; //total monethly expense
         
         System.out.println(); //Blank line for readability
         System.out.println("Total monthly expense: " + TotalExpense);

         System.out.println("TA/Grader Wage Rate: " + wageRate);
         System.out.println(); //Blank line

         //To calculate the number of hours per week the 
         //student have to work to break work even. Total Expenses has
         // to be equal to weekly pay and has to be divide by 4.
         double weeklyPay = (double)TotalExpense / 4.0; 


         //Formula for getting number of hours worked  
         double hoursPerWeek = weeklyPay / wageRate;

         //Printing the value
         System.out.println("Number of hours per week for the student to work to break even: " + hoursPerWeek + "hrs");

         //Now there has to be a $100 saving monthly so we have to 
         //add it with the total expense and divide it by 4. To get the 
         //new weekly pay. 
         weeklyPay = (TotalExpense + 100)/4;
         hoursPerWeek = weeklyPay / wageRate;

         //Printing the values
         System.out.println("Number of hours per week the student has to work to take out living expenses with a $100 saving per month: " + hoursPerWeek + "hrs");

         

         










    }
    
}

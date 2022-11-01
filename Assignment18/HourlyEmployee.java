//This program calculates the weekly Income of hourly employees
//
//Shiven Bhardwaj
//
//Assignment 18
public class HourlyEmployee extends Payroll
{
  public double wageRate;
  public double hours;
  
  
  //Default Constructor 
  public HourlyEmployee(){
    super();
    wageRate = 0.0;
    hours = 0.0;

  }
  
  //Conversion Constructor 
  //Precondition - hours and wage rate cannot be neagtive 
  public HourlyEmployee(String newName, String newID, String newJobTitle,
                     double newWageRate, double newHours){  
                         
     super(newName, newID, newJobTitle);
     if (newHours >=0 && newWageRate >=0) {
        wageRate = newWageRate;
        hours = newHours;
        }
    
    else
     System.out.println("Error! Wage rate and hours cannot be negative");
     
                                                                                                                                                 
  }
  
  
  //Copy Constructor 
  //Precondition - hours and wage rate cannot be negative
  public HourlyEmployee(HourlyEmployee other){  
                         
     super(other.getName(), other.getID(), other.getJobTitle());
     
     if (hours >= 0 && wageRate >= 0 ) {
         hours = other.hours;
         wageRate = other.wageRate;
         }
        
     else{
     System.out.println("Error! hours and Wage rate cannot be negative");
     
    }
    
    
     
     
                                                                                                                                                 
  }
  
  //Abstract Class
  //toString() -- Different for every derived class 
  public String toString(){
      return ("Name: " + getName() + "\nID: " + getID() + "\nJob Title: " + 
                       getJobTitle() + "\nWageRate(weekly): " + wageRate +
                                   "\nHours(per week): " + hours);
  
  }
  
  //Abstract Class
  //getPay() -- Different for every derived class
  public double getPay(){
      if (hours > 40)
       return 1.5 * wageRate * hours;
       
      else 
       return wageRate * hours;
      
      
  }
}

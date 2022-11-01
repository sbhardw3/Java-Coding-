//This program calculates the weekly Income of salaried employees
//
//Shiven Bhardwaj
//
//Assignment 18
public class SalariedEmployee extends Payroll
{
  public double annualSalary;
  
  // Default Constructor 
  public SalariedEmployee(){
    super();
    annualSalary = 0;

  }
  
  
  //Conversion Constructor 
  //Preconditon - Annual Salary cannot be negative
  public SalariedEmployee(String newName, String newID, String newJobTitle,
                     double newAnnualSalary){  
                         
     super(newName, newID, newJobTitle);
     
     if (newAnnualSalary >= 0)
     annualSalary = newAnnualSalary;
     
     else {
     System.out.println("Error! Salary cannot be negative");
    
    }
     
                                                                                                                                                 
  }
  
  //Copy Constructor
  //Precondition - Annual Salary cannot be negative
  public SalariedEmployee(SalariedEmployee other){  
                         
     super(other.getName(), other.getID(), other.getJobTitle());
     
     if (annualSalary >= 0)
     annualSalary = other.annualSalary;
     
     else 
     System.out.println("Error! Invalid value of Salary");
                                                                                                                                              
  }
  
  //Abstract class
  //toString() -- Different for every derived class  
  public String toString(){
      return ("Name: " + getName() + "\nID: " + getID() + "\nJob Title: " + 
                       getJobTitle() + "\nSalary: " + annualSalary);
  }
  
  //Abstract class
  //toPay() -- Different for every derived class 
  public double getPay(){
      return  annualSalary / 52;
  }
}
//Testing the program of caluclating the weekly income of employees

public class TestPayroll
{
    public static void main(String[] args){
        HourlyEmployee p1 = new HourlyEmployee("Marcus", "Gaulden", "Secretary",
                                                18, 38);
        
        SalariedEmployee p2 = new SalariedEmployee("Michelle", "Thompson", 
                                  "News Editor", 120000);
        
        SalariedEmployee p3 = new SalariedEmployee(p2);
        
         
        HourlyEmployee p4 = new HourlyEmployee("Martin" , "Jackson", "Worker",
                                                 15.5, 45);
                                                
                                 
        System.out.println(p1);
        System.out.println("Earning per week: " + p1.getPay());
        System.out.println(); //Blank space for readability
        
         
        System.out.println(p2);
        System.out.println("Earning per week: " + p2.getPay());
        System.out.println(); //Blank space for readability
        
         
        System.out.println(p3);
        System.out.println("Earning per week: " + p3.getPay());
        System.out.println(); //Blank space for readability
        
         
        System.out.println(p4);
        System.out.println("Earning per week: " + p4.getPay());
        System.out.println(); //Blank space for readability
       
        
        
        
                                                      
        
        
        
        
        
    }
}

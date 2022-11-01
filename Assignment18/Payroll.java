//This program calculates the weekly Income of different employees
//
//Shiven Bhardwaj
//
//Assignment 18
 
public abstract class Payroll
{
    private String Name;
    private String ID;
    private String jobTitle;
    
    //Default Constructor 
    public Payroll(){
        Name = new String();
        ID = null;
        jobTitle = new String();   
    }
    
    //Conversion Constructor 
    //Precondition - Name, Id and Job Title cannot be null
    public Payroll(String newName, String newID, String newJobTitle){
        if (newName != null && !newName.equals("") && newID != null &&
                           newJobTitle != null && !newJobTitle.equals("")){
            
              Name = newName;
              ID = newID;
              jobTitle = newJobTitle;
            }     
        
        else{
            System.out.println("Fatal error! Name, ID or Job Title" 
                               + "cannot be empty or null");
            System.exit(0);
             }
    }
    
    // Copy Constructor 
    //Precondition - Name, Id and Job Title cannot be null
    public Payroll(Payroll other){
        if (other != null){
            Name = other.Name;
            ID = other.ID;
            jobTitle = other.jobTitle;
        }
        
        else {
            System.out.println("Fatal error! Name, ID or Job Title" 
                               + "cannot be empty or null");
            System.exit(0);
             }
    }
    
    //Accessors for Name, ID and Job Title
    public String getName(){
        return Name;
    }
    
    public String getID(){
        return ID;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    
    //setName() - a mutator for name 
    //Precondition - Name cannot be empty
    public void setName(String newName){
        if (!newName.equals("")){
            Name = newName;
        }
        
        else {
            System.out.println("Error! Name cannot be left empty");
            System.exit(0);
        }
    }
    
    
    //setID() - a mutator for ID 
    //Precondition - ID cannot be empty
    public void setID(String newID){
        if (newID != null){
            ID = newID;
        }
        
        else {
            System.out.println("Error! ID cannot be null");
            System.exit(0);
        }
    }
    
    
    //setJobTitle() - a mutator for Job Title 
    //Precondition - Job Title cannot be empty
    public void setJobTitle(String newJobTitle){
        if (!newJobTitle.equals("")){
            jobTitle = newJobTitle;
        }
        
        else {
            System.out.println("Error! Job Tile cannot be left empty");
            System.exit(0);
        }
    }
    
    public boolean equals(Payroll other){
        return (Name.equals(other.Name) && ID.equals(other.ID) && 
                                   jobTitle.equals(other.jobTitle));
    }
    
    //Abstract classes
    public abstract double getPay();
    
    public abstract String toString();
    
        
}

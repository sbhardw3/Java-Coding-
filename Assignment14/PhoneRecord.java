
public class PhoneRecord
{
    public String firstName;
    public String lastName;
    public String number;
    
    //Default Constructor 
    public PhoneRecord(){
        this.firstName = "no name";
        this.lastName = "no name";
        this.number = null;
    }
    
    //Conversion Constructor
    public PhoneRecord(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
    
}
//NegativeNumberException is a subclass of exception which prints  
//an when a negative is written.
//
//Date: 5/7/21
//
//Written by: Shiven Bhardwaj
//
//Assignment 19

public class NegativeNumberException extends Exception
{
    private int negativeNumber;
    
    
    public NegativeNumberException(int number){
        super("Negative number exception");
        negativeNumber = number;
        
    }
    
    //Default Constructor
    public NegativeNumberException(){
        super("Negative number Expection");
    }
    
    //Conversion Constructor
    public NegativeNumberException(String message){
        super(message);
    }
    
    //Accessor
    public int getNegativeNumber(){
        return negativeNumber;
    }
}

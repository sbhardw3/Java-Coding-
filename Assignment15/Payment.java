
/**
 *
 */
public class Payment
{
    protected double amount;
    
    public Payment(){
        amount = 0.0;
    }
    
    public Payment(double newAmount){
        amount = newAmount;
    }
    
    public Payment(Payment other){
        amount = other.amount;
    }
   
    public double getAmount(){
        return amount;
    }
    
    public void setAmount(double newAmount){
        amount = newAmount;
    }
    
    public void paymentDetails(){
        System.out.println("The amount of payemnt: $" + amount);
    }
    
    
}


public class CashPayment extends Payment
{
    public CashPayment(){
        super();
    }
   
    
    public CashPayment(double newAmount){
       super(newAmount);
    }
    
    public CashPayment(CashPayment other){
        super(other.amount);
    }
    
    public void paymentDetails(){
        System.out.println("The amount of cash: " + amount);
    }
   
    
 
}

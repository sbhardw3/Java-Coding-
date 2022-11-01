
public class CreditCardPayment extends Payment
{
    public String name;
    public String number;
    public String expDate;
    
    public CreditCardPayment(){
        super();
        name = null;
        number = null;
        expDate = null;
    }
    
    public CreditCardPayment(double newAmount, String newName, String newNum,
                                         String newExpDate){
        super(newAmount);
        name = newName;
        number = newNum;
        expDate = newExpDate;
    }
    
    public CreditCardPayment(CreditCardPayment other){
        super(other.amount);
        name = other.name;
        number = other.number;
        expDate = other.expDate;
    }
    
    public void paymentDetails(){
        System.out.println("The payment of $" + amount + " through the card number"
                           + number + " ,Expiry date " + expDate + " with the card name "
                           + name);
    
    }
        
        
        
   
}

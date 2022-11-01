
public class main
{
    public static void main(String[] args){
        CreditCardPayment x = new CreditCardPayment(33.43, "David Mason", 
                                                         "13222443334", "11/22");
        CashPayment y = new CashPayment(57.33);
        
        CreditCardPayment z = new CreditCardPayment(1822.22, "Thomas Shelby", "53532423221",
                                                         "05/28");
        CashPayment s = new CashPayment(98.09);
        
        x.paymentDetails();
        y.paymentDetails();
        z.paymentDetails();
        s.paymentDetails();
    }
        
}

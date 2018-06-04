package strategypattern;

public class PayPalPayment implements PaymentStrategy {



    String emailId;
    String password;

    public PayPalPayment(String emailId, String password){

        this.emailId = emailId;
        this.password = password;
    }



    public void pay(double amount){

        System.out.println(amount + "  Payment done through  Paypal. Thank you");
    }
}

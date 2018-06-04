package strategypattern;

public class CreditCardPayment implements PaymentStrategy{

    String name;
    String cardNo;
    int cvv;
    String dateOfExpiry;

        public CreditCardPayment(String name,String CardNo,int cvv,String date){

        this.cardNo  = CardNo;
        this.cvv = cvv;
        this.name = name;
        this.dateOfExpiry = date;
        }

        public void pay(double amount){

        System.out.println(amount + "   Paid by Credit card. Thank You ");
        }
}

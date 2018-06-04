package strategypattern;

public class ShoppingCartTest {

    public static void main(String []args){

        ShoppingCart cart = new ShoppingCart();

        Items item1 = new Items("1121A",12.99);
        Items item2 = new Items("1123B",7.00);

        cart.addItems(item1);
        cart.addItems(item2);

        cart.pay(new CreditCardPayment("Preetesh","****-2089",121,"03/2022"));

        cart.pay(new PayPalPayment("john059@gmail.com","maverick@123"));
    }
}

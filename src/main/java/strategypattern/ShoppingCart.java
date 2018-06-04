package strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Items> items;

    public ShoppingCart(){
        this.items = new ArrayList<Items>();
    }


    public void addItems(Items item){

        this.items.add(item);
    }

    public void removeItems(Items item){

        this.items.remove(item);
    }

    public double calculateTotal(){

        double sum = 0;

        for(Items i : items ){
            sum+=sum + i.getPrice();
        }

        return sum;

    }

    public void pay(PaymentStrategy paymentStrategy){

        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}

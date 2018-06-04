package strategypattern;

public class Items {

    String uid;
    double price ;

    public Items(String uid , double price){

        this.price = price;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

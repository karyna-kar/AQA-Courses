package Task3_1;

public class Tulip extends Flowers {
    public int amount;
    public Tulip(String name, String color,  double price/*, int amount*/){
        super(name, color, price);
        total+=price;
    }
}

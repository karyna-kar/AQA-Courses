package Task2_1;

public class Flowers {
    protected String name;
    protected double price;
    protected String color;

    public Flowers(String name, String color, double price){
        this.name=name;
        this.color=color;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



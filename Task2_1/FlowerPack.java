package Task2_1;
import java.util.ArrayList;

public class FlowerPack  {
    private ArrayList<Flowers> flowersPack = new ArrayList<Flowers>();

    void addFlowersPack(Flowers flower){
        flowersPack.add(flower);
    }

    public double getPackPrice() {
       double total = 0;
        for (Flowers f : flowersPack) {
            total = total + f.getPrice();
        }
        return total;
    }
}


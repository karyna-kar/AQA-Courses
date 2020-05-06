package Task2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        FlowerPack pack = new FlowerPack();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number of Roses in bouquet: ");
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            Rose rose = new Rose("Rose", "White", 3.5);
            pack.addFlowersPack(rose);
        }

        System.out.print("Enter a number of Tulips in bouquet: ");
        count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            Tulip tulip = new Tulip("Tulip", "Yellow", 2);
            pack.addFlowersPack(tulip);
        }

        System.out.println("Total price: "+pack.getPackPrice()+" $");
    }
}

package Task3_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество Роз в букете: ");
        int count =  Integer.parseInt(reader.readLine());
        Rose roses [] = new Rose [count];
        for(int i=0; i<roses.length;i++) {
            roses[i] = new Rose("Роза кустовая", "Белая", 3.5);
        }


        System.out.print("Введите количество Тюльпанов в букете: ");
        count =  Integer.parseInt(reader.readLine());
        Tulip tulips [] = new Tulip [count];
        for (int i=0; i< tulips.length; i++) {
            tulips[i] = new Tulip("Тюльпан", "Желтый", 2);
        }

        System.out.println("Sum:" + Flowers.total);
    }
}

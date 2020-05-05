package Lesson2;

public class Main {
    public static void main(String[] args)
    {
        Cat cat = new Cat ("Барсик", "Бенгальская кошка", "Пятнистый золотой", "Голубые",  25, 5);

        System.out.println("Our cat: ");

        System.out.println("Name: " + cat.name + "; " + "Breed: " + cat.breed + "; " + "Color: " + cat.color + "; " + "Eyes: " + cat.eyes + "; "+ "Height: " + cat.getHeight() + "; " + "Weight: " + cat.getWeight());

        System.out.println("Available methods: ");

        cat.eat();
        cat.sleep();
        cat.voice();
        cat.play();
    }
}

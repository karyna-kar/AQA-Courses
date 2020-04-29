package Lesson2;

public class Main {
    public static void main(String[] args)
    {
        Cat cat = new Cat ("Барсик", "Бенгальская кошка", "Пятнистый золотой", "Голубые",  25, 5);

        System.out.println("Наш котик: ");

        System.out.println("Кличка: " + cat.name + "; " + "Порода: " + cat.breed + "; " + "Окрас: " + cat.color + "; " + "Глаза: " + cat.eyes + "; "+ "Рост: " + cat.getHeight() + "; " + "Вес: " + cat.getWeight());

        System.out.println("Доступные Методы: ");

        cat.eat();
        cat.sleep();
        cat.voice();
        cat.play();
    }
}

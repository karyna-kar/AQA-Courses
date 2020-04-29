package Lesson2;

public class Cat extends Animals {
    //поля
    public String  breed, eyes;
    private int height, weight;

    //конструктор
    public Cat(String name, String breed, String color, String eyes,  int height, int weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.eyes = eyes;
        this.height = height;
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0)
            this.height = height;
        else
            System.out.println("Ошибка! Рост не может быть отрицательным числом!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int height) {
        if (height >= 0)
            this.weight = weight;
         else
            System.out.println("Ошибка! Вес не может быть отрицательным числом!");
    }

    //методы
    public void voice ()
    {
        System.out.println("Мяукать");
    }

    public void play ()
    {
        System.out.println("Играть");
    }
}

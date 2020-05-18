package Task;

import Task.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car = (Car) new ProductAssembly().assembleProduct(car);
    }
}

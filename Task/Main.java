package Task;

public class Main {
    public static void main(String[] args) {
        IProduct car = new Car();
        IAssemblyLine line = new AssemblyLine();
        line.assembleProduct(car);
    }
}

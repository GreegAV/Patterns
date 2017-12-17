package Factory;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.create("bmw");
        Car toyota = carFactory.create("toyota");
        bmw.drive();
        toyota.drive();
    }
}

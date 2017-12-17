package Factory;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.createCar("bmw");
        Car toyota = carFactory.createCar("toyota");
        bmw.drive();
        toyota.drive();
    }
}

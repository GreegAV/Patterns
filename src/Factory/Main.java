package Factory;

/**
 * Created by avg-m on 17/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car bmw = factory.create("bmw");
        Car toyota = factory.create("toyota");
        bmw.drive();
        toyota.drive();
    }
}









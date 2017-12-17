package AbstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("car");
        Factory tankFactory = new AbstractFactory().createFactory("tank");
        Car toyota = carFactory.createCar("toyota");
        Tank t62 = tankFactory.createTank("t62");
        t62.shoot();
        toyota.drive();
    }


}

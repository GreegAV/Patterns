/**
 * Created by avg-m on 17/12/2017.
 */
public class Factory {
    public static void main(String[] args) {
        MyFactory myFactory = new MyFactory();
        Car bmw = myFactory.create("bmw");
        Car toyota = myFactory.create("toyota");
        bmw.drive();
        toyota.drive();
    }
}

interface Car{
    void drive();
}

class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("Drive your dream! Toyota.");
    }
}

class BMW implements Car{
    @Override
    public void drive() {
        System.out.println("The power of BMW!");
    }
}

class MyFactory {
    public Car create(String carType){
        switch (carType){
            case "bmw": return new BMW();
            case "toyota": return new Toyota();
            default: return null;
        }
    }
}

package Factory;

/**
 * Created by avg-m on 17/12/2017.
 */
public class CarFactory implements Factory {
    public Car createCar(String carType) {
        switch (carType) {
            case "bmw":
                return new BMW();
            case "toyota":
                return new Toyota();
            default:
                return null;
        }
    }
}









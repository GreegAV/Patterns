package AbstractFactory;

/**
 * Created by avg-m on 17/12/2017.
 */
public class CarFactory implements Factory {
        @Override
        public Car createCar(String carType){
            switch (carType){
                case "bmw": return new BMW();
                case "toyota": return new Toyota();
                default: return null;
            }
        }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}









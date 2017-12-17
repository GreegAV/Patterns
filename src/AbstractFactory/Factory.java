package AbstractFactory;

public interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);

}

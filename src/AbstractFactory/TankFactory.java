package AbstractFactory;

class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    @Override
    public Tank createTank(String carType){
        switch (carType){
            case "t34": return new T34();
            case "t62": return new T62();
            default: return null;
        }
    }
}

package AbstractFactory;

class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "tank":
                return new TankFactory();
            case "car":
                return new CarFactory();
            default:
                return null;
        }
    }
}


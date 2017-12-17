package Factory;

class Factory {
    public Car create(String carType){
        switch (carType){
            case "bmw": return new BMW();
            case "toyota": return new Toyota();
            default: return null;
        }
    }
}

package Builder;

public class MainBuilder {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi")
                                        .setColor("Red")
                                        .setMaxSpeed(300)
                                        .build();
        SportCar sportCar1 = new SportCar.Builder("Audi")
                                        .build();

        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
        System.out.println();
        System.out.println(sportCar1.getName());
        System.out.println(sportCar1.getColor());
        System.out.println(sportCar1.getMaxSpeed());

    }
}

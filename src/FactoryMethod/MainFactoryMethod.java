package FactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
//        FactoryMethod factoryMethod = new FactoryMethod();
        FactoryMethod factoryMethod = FactoryMethod.create();
        factoryMethod.setName("FactoryMethod!");
        System.out.println(factoryMethod.getName());
    }
}

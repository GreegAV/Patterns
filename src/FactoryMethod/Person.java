package FactoryMethod;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person() {

    }

    public static Person create() {
        System.out.println("new Person() will not be run due to private constructor!");
        return new Person();
    }
}

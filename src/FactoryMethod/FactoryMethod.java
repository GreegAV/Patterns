package FactoryMethod;

public class FactoryMethod {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private FactoryMethod() {

    }

    public static FactoryMethod create() {
        System.out.println("new Person() will not be run due to private constructor!");
        return new FactoryMethod();
    }
}

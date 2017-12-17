package FactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        Person person = Person.create();
//        Person person1 = new Person();
        person.setName("Vasya!");
        System.out.println(person.getName());
    }
}

package Prototype;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        cache.setStudent(new Student());

        Student student = cache.getStudent();
    }
}

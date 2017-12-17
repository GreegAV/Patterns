package Singleton;

public class Singleton {
    static Singleton singleton = new Singleton();
    int i = 100;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.i);
        singleton2.i = 999;
        System.out.println(singleton.i);
    }
}

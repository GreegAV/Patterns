package Factory;

class BMW implements Car{
    @Override
    public void drive() {
        System.out.println("The power of BMW!");
    }
}
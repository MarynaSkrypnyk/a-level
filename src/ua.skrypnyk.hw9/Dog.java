package src.ua.skrypnyk.hw9;

public class Dog extends Animal {
    private int hourseOfSleep;
    private String kindOfFood;
    public Dog(String kindOfFood, int hourseOfSleep) {
        super(kindOfFood, hourseOfSleep);
        this.kindOfFood = kindOfFood;
        this.hourseOfSleep = hourseOfSleep;
    }

    @Override
    public void eat() {
        System.out.println("Birds");
    }
}

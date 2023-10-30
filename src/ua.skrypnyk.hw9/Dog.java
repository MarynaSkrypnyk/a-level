package src.ua.skrypnyk.hw9;

public class Dog extends Animal {
    private String kindOfFood;
    private int hourseOfSleep;

    public Dog(String kindOfFood, int hourseOfSleep) {
        super(kindOfFood, hourseOfSleep);
        this.kindOfFood = kindOfFood;
        this.hourseOfSleep = hourseOfSleep;
    }
    @Override
    public void eat() {
        System.out.println("Birds");
    }
    public final void walk(){
        System.out.println("walk");
    }
}
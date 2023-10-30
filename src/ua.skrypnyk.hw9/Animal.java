package src.ua.skrypnyk.hw9;

public class Animal {
    private String kindOfFood;
    private int hourseOfSleep;

    private Animal(String kindOfFood, int hourseOfSleep){
        this.kindOfFood = "meat";
        this.hourseOfSleep = 10;
    }
    public void sleep(){
        System.out.println(kindOfFood);
    }
    public void eat () {
        System.out.println(hourseOfSleep);
    }


}

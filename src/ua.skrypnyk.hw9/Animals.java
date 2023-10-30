package src.ua.skrypnyk.hw9;

public class Animals {
    private String kindOfFood;
    private int hourseOfSleeping;

    private Animals (String kindOfFood, int hourseOfSleeping){
        this.kindOfFood = kindOfFood;
        this.hourseOfSleeping = hourseOfSleeping;
    }

    public void hourseOfSleeping (){
        System.out.println("Sleep  " + hourseOfSleeping );
    }
    public void setKindOfFood () {
        System.out.println("Eat "+ kindOfFood);
    }
}

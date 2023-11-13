package src.ua.skypnyk.hw6;

public class Phone {

    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){
    }

    public static void main(String[] args) {
        Phone firstPhone = new Phone (42_42_42,"Samsung",12.1);
        Phone secondPhone= new Phone(43_43_43,"Apple");
        secondPhone.weight = 12.2;
        Phone thirdPhone = new Phone();
        thirdPhone.number = 44_44_44;
        thirdPhone.model = "Xiaomi";
        thirdPhone.weight = 12.3;

        System.out.println(firstPhone);
        System.out.println(secondPhone);
        System.out.println(thirdPhone);

        System.out.println("Call " + firstPhone.receiveCall("Maria"));
        System.out.println("Call "+ secondPhone.receiveCall("Andrey"));
        System.out.println("Call " + thirdPhone.receiveCall("Valia"));

        System.out.println(firstPhone.getNumber(firstPhone.number));
        System.out.println(secondPhone.getNumber(secondPhone.number));
        System.out.println(firstPhone.getNumber(thirdPhone.number));
    }
    public String receiveCall(String name){
        this.model = name;
        return name;
    }
    public int getNumber (int number){
        this.number = number;
        return number;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

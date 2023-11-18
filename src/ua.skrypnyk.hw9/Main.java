package src.ua.skrypnyk.hw9;

public class Main {
    public static void main (String[] args) {
        Animal dog = new Dog("Meat", 5);
        Animal cat = new Dog("Fish", 18);
        Animal fish = new Dog("food", 3);

        dog.eat();
        dog.sleep();


        String dogFood = dog.getKindOfFood();
        String catFood = cat.getKindOfFood();
        String fishFood = fish.getKindOfFood();


        int dogHourse = dog.getHourseOfSleep();
        int catHourse = cat.getHourseOfSleep();
        int fishHourse = fish.getHourseOfSleep();


        if (dogHourse > catHourse) {
            if (dogHourse > fishHourse) {
                System.out.println("Dog hourse of sleepin is bigger cat and fish hourse and eat " + dog.getKindOfFood());
            }
        } else if (catHourse > dogHourse) {
            if (catHourse > fishHourse) {
                System.out.println("Cat hourse of sleepin is bigger dog and fish hourse and eat  " + cat.getKindOfFood());
            }
        } else if (fishHourse > dogHourse) {
            if (fishHourse > catHourse) {
                System.out.println("Fisj hourse of sleepin is bigger cat and fish hourse and eat " + fish.getKindOfFood());
            }
        }
    }
}


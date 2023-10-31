package src.ua.skrypnyk.hw9;

public class Animal {
        private String kindOfFood;
        private int hourseOfSleep;

        public Animal(String kindOfFood, int hourseOfSleep) {
            this.kindOfFood = kindOfFood;
            this.hourseOfSleep = hourseOfSleep;
        }

        public String getKindOfFood() {
            return kindOfFood;
        }

        public int getHourseOfSleep() {
            return hourseOfSleep;
        }

        public void sleep() {
            System.out.println("Sleep " + hourseOfSleep);
        }

        public void eat() {
            System.out.println("Eat " + kindOfFood);
        }
    }


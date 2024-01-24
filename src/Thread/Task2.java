package src.Thread;

public class Task2 {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(()->{
            for (int i = 0; i < 4; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                counter++;
            }
        });
        thread.start();
        thread.join();

        System.out.println(counter);
    }
}

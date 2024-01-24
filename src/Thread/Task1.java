package src.Thread;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        Runnable runnable= ()-> {
            while (true){
                System.out.println("Hello, A-Level - Runnable");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }
}

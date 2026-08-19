public class RunnableInterface {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println("Thread 1 interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Jogging");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println("Thread 2 interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

class SharedResource {

    volatile boolean running = true;

    public void runTask() {
        System.out.println("Task started...");
        while (running) {

        }
        System.out.println("Task stopped.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.runTask());
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping task...");
        resource.running = false;
    }
}

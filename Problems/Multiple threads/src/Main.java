public class Main {

    public static void main(String[] args) {
        Thread thread1 = new WorkerThread();
        Thread thread2 = new WorkerThread();

        thread1.setName("worker-A");
        thread2.setName("worker-B");
        thread1.start();
        thread2.start();
        // create instances and start threads here
    }
}

// Don't change the code below
class WorkerThread extends Thread {

    private static final int numberOfLines = 3;

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("do something...");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableWorker());
        Thread thread2 = new Thread(new RunnableWorker());
        Thread thread3 = new Thread(new RunnableWorker());

        thread1.setName("worker-X");
        thread2.setName("worker-Y");
        thread3.setName("worker-H");

        thread1.start();
        thread2.start();
        thread3.start();
        // create threads and start them using the class RunnableWorker
    }
}

// Don't change the code below       
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}
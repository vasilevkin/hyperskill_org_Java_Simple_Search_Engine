class Info {

    public static void printCurrentThreadInfo() {
        Thread thread = Thread.currentThread();

        System.out.println("name: " + thread.getName());
        System.out.println("priority: " + thread.getPriority());
        // get the thread and print its info
    }
}

class StartingMultipleThreads {

    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        Thread t2 = new HelloThread();

        t1.start();
        t2.start();

        System.out.println("Finished");
    }
}

class HelloThread extends Thread {

    @Override
    public void run() {
        String helloMsg = String.format("Hello, i'm %s", getName());
        System.out.println(helloMsg);
    }
}

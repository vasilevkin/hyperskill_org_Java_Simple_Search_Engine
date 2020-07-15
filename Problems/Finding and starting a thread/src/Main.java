class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {

        for (Thread thread : threads) {
            if (thread.getState() == Thread.State.NEW) {
                thread.start();
                thread.join();
                break;
                Runnable run = new Runnable() {
                    @Override
                    public void run() {

                    }
                }
            }
        }
        // implement this method
    }
}

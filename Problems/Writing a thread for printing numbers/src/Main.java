class NumbersThread extends Thread {

    int from;
    int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
        // implement the constructor
    }

    @Override
    public void run() {
        super.run();

        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
    // you should override some method here
}

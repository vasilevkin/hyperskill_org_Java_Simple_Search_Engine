import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(10); // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            executor.submit(new PrintIfPrimeTask(number));
            // create and submit tasks
        }

        executor.shutdown();
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        //check if n is a multiple of 2
        if (number == 1) return;
        if (number % 2 == 0 && number != 2) return;
        //if not, then just check the odds
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return;
        }
        System.out.println(number);
    }
    // write code of task here
}

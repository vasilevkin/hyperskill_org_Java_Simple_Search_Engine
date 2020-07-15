import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        scanner.nextInt();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                deque.add(number);
            } else {
                deque.addFirst(number);
            }
        }

        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
        // put your code here
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        Random random = new Random(a + b);
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(b - a + 1) + a;
            sum += number;
        }

        System.out.println(sum);
        // write your code here
    }
}

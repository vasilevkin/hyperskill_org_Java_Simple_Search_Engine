package search;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String search = scanner.nextLine();
        String result = "Not Found";

        for (int i = 0; i < words.length; i++) {
            if (search.equals(words[i])) {
                result = String.valueOf(i + 1);
            }
        }

        Class.forName()
        System.out.println(result);
    }
}

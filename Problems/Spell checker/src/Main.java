import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int l;
        Set<String> checker = new HashSet<>();
        Set<String> words = new HashSet<>();

        while (input.hasNext()) {
//        for (int i = 0; i < d; i++) {
            String word = input.next();

            try {
                Integer.parseInt(word);
                checker.add(word);
            } catch (Exception e) {
                break;
            }
        }

//        l = input.nextInt();

        while (input.hasNext()) {
//        for (int i = 0; i < l; i++) {
            words.add(input.next());
        }

        words.removeAll(checker);

        for (String word : words) {
            System.out.println(word);
        }
        // put your code here
    }
}

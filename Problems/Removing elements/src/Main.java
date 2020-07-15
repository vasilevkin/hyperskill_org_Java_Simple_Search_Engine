import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> words = new HashSet<>();

        for (String word : str.split("\\s+")) {
            words.add(Integer.parseInt(word));
        }

        return words;
        // write your code here
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(number -> number > 10);
        // write your code here
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
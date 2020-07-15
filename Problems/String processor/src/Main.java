import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        String word;
        boolean containsLowercase = false;

        do {
            word = scanner.next();
            containsLowercase = false;

            for (Character symbol : word.toCharArray()) {
                if (Character.isLowerCase(symbol)) {
                    containsLowercase = true;
                    break;
                }
            }

            if (containsLowercase) {
                System.out.println(word.toUpperCase());
            }
        } while (containsLowercase);

        System.out.println("FINISHED");
        // implement this method
    }
}

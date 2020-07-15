//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String education = scanner.nextLine();
        int experience = Integer.parseInt(scanner.nextLine());
        String cuisine = scanner.nextLine();

        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef that cooks " + cuisine + " dishes.");
        // put your code here
    }
}

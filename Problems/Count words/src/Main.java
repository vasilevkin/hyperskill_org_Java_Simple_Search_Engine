import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        int result = 0;
        // start coding here
        reader.close();

        if (input.isEmpty()) {
            result = 0;
        } else {
            String[] words = input.split("\\s+");
            result = words.length;
        }

        System.out.println(result);
    }
}

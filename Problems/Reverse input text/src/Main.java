import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Character[] charsArr = new Character[50];
        String input = reader.readLine();

        sb.append(input);
        sb.reverse();
        System.out.println(sb.toString());
        // start coding here
        reader.close();
    }
}

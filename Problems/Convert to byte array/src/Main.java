import java.io.CharArrayWriter;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                writer.append(letter);
            }
        }
        return writer.toCharArray();
        // implement the method
    }
}

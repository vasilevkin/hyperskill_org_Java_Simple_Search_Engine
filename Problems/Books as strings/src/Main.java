import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) {
//        Book book = new Book("Java 8 & 9 in Action",
//                2017,
//                new String[]{"Mario Fusco", "Alan Mycroft"});
//
//        System.out.println(book);
//    }
//}

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb
                .append("title=")
                .append(title)
                .append(",yearOfPublishing=")
                .append(yearOfPublishing)
                .append(",authors=[");

        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i]);

            if (i != (authors.length - 1)) {
                sb.append(",");
            }

        }

        sb.append("]");

        return sb.toString();
    }
}

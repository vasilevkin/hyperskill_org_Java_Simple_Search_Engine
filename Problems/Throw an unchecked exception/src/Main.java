public class Main {

    public static void method() {
        throw new RuntimeException("Some unchecked runtime exception.");
        // write your code here
    }

    /* Do not change code below */
    public static void main(String args[]) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

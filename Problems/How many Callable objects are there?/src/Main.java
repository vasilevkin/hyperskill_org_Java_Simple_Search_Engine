import java.util.concurrent.*;


class FutureUtils {

    public static int determineCallableDepth(Callable callable) throws Exception {
        int count = 1;
        boolean hasNextCallable = false;
        Callable nextCallable = callable;

        do {

            Object next = nextCallable.call();

            try {
                if (next instanceof Callable) {
                    count++;
                    hasNextCallable = true;
                    nextCallable = (Callable) next;
                } else {
                    hasNextCallable = false;
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                hasNextCallable = false;
            }

        } while (hasNextCallable);

        return count;
        // write your code here
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        int sum = 0;
        List<Future<Callable<Integer>>> reversed = new ArrayList<>(items);

        Collections.reverse(reversed);

        for (Future<Callable<Integer>> item : reversed) {
            try {
                int i = item.get().call();
                sum += i;
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        return sum;
        // write your code here
    }
}

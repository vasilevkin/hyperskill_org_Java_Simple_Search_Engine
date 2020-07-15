import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        int totalLoad1 = 0;
        int totalLoad2 = 0;
        Task task;
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            task = new Task(input.nextInt(), input.nextInt());

            if (totalLoad1 < totalLoad2) {
                queue2.add(task.getId());
                totalLoad2 += task.getPriority();
            } else {
                queue1.add(task.getId());
                totalLoad1 += task.getPriority();
            }
        }

        while (queue1.peek() != null) {
            System.out.print(queue1.poll() + " ");
        }
        System.out.println();
        while (queue2.peek() != null) {
            System.out.print(queue2.poll() + " ");
        }
        // put your code here
    }
}

class Task {

    private int id;
    private int priority;

    public Task(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

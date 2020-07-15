import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] seats = new int[n][m];
        int row = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        rowsloop:
        for (int i = 0; i < n; i++) {
            int free = 0;
            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    free++;
                } else {
                    free = 0;
                }

                if (free >= k) {
                    row = i + 1;
                    break rowsloop;
                }
            }
        }

        System.out.println(row);
        // put your code here
    }
}

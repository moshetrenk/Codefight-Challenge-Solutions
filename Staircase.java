import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - x; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < x; j++) {
                System.out.print('#');
            }

            x++;
            System.out.println();

        }
    }
}

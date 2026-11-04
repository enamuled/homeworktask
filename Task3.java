
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N (0 to 12): ");
        int n = input.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("Invalid input");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);
        }

        input.close();
    }
}

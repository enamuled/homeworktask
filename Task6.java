
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer N (minimum 2): ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Invalid input");
        } else {

            System.out.println("Prime numbers from 2 to " + n + ":");

            for (int i = 2; i <= n; i++) {

                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }

        input.close();
    }
}


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {

            int count = 0;

            System.out.println("Even numbers:");

            for (int i = 1; i <= n; i++) {

                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    count++;
                }
            }

            System.out.println("\nCount: " + count);
        }

        input.close();
    }
}

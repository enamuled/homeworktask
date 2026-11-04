
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height (minimum 2): ");
        int height = input.nextInt();

        System.out.print("Enter width (minimum 2): ");
        int width = input.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Invalid input");
        } else {

            for (int i = 1; i <= height; i++) {

                for (int j = 1; j <= width; j++) {

                    if (i == 1 || i == height ||
                            j == 1 || j == width) {

                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }

        input.close();
    }
}

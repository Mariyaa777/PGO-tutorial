import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            System.out.println("The number is positive");
        } else if (userInput < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The value equals 0");
        }

       scanner.close();
    }
}
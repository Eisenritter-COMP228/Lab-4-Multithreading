
import java.util.Scanner;

public class MultithreadedCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        boolean runAgain = true;
        do {
            System.out.println("Welcome to the Centennial College Multithreaded Calculator");
            System.out.print("Please enter the first integer: ");
            a = scanner.nextInt();
            System.out.print("Please enter the second integer: ");
            b = scanner.nextInt();

            Thread addition = new Addition(a, b);
            Thread subtraction = new Subtraction(a, b);
            Thread multiplication = new Multiplication(a, b);
            Thread division = new Division(a, b);

            // Dependent on CPU
            addition.setPriority(10);
            subtraction.setPriority(9);
            multiplication.setPriority(8);
            division.setPriority(7);

            addition.start();
            subtraction.start();
            multiplication.start();
            division.start();
            try {
                addition.join();
                subtraction.join();
                multiplication.join();
                division.join();
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
            System.out.println("Do you wish to exit the calculator (y/n)");
            switch (scanner.next().toLowerCase()) {
                case "y":
                case "yes":
                    runAgain = false;
                    break;
                case "n":
                case "no":
                    runAgain = true;
                default:
                    continue;
            }
        } while (runAgain);
        System.out.println("Thanking you for using this application. Have a good day!");
    }
}

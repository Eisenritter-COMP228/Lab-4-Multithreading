
import java.util.Scanner;
public class MultithreadedCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Welcome to the Centennial College Multithreaded Calculator");
        System.out.print("Please enter the first integer: ");
        a = scanner.nextInt();
        System.out.print("Please enter the second integer: ");
        b = scanner.nextInt();

        Thread addition = new Addition(a, b);
        addition.start();
        Thread subtraction = new Subtraction(a,b);
        subtraction.start();
        Thread multiplication = new Multiplication(a,b);
        multiplication.start();
        Thread division = new Division(a,b);
        division.start();
    }
}

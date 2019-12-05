public class Multiplication extends Thread {
    private int a;
    private int b;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("The result of the multiplication operation on " + a + " and " + b + " is " + (a * b));
    }
}


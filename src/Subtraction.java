public class Subtraction extends Thread {
    private int a;
    private int b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("The result of the subtraction operation on " + a + " and " + b + " is " + (a - b));
    }
}


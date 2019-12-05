public class Division extends Thread {
    private int a;
    private int b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0) {
            System.out.println("The result of the addition operation on " + a + " and " + b + " is " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}


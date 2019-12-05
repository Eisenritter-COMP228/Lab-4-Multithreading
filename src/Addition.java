public class Addition extends Thread{
    private int a;
    private int b;
    public Addition(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        System.out.println("The result of the addition operation on " +a +" and " +b + " is " +(a+b));
    }
}

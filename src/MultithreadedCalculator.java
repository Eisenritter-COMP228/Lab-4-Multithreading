
public class MultithreadedCalculator {
    public static void main(String args[]){
        System.out.println("hello there..");

        Task taskRunner = new Task();
        taskRunner.start();
    }
}

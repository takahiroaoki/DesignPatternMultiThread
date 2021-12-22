package introduction.example2;

public class ExecuteIntroExam2 {
    
    public static void main(String[] args) {
        Thread thread = new Thread(
            new MyRunnable()
        );
        thread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("This is main thread");
        }
    }
}

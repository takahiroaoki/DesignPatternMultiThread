package introduction1.example1;

public class ExecuteIntro1Exam1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        
        for (int i = 0; i < 200; i++) {
            System.out.println("This is the main thread");
        }
    }
}

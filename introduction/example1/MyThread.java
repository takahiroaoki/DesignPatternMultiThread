package introduction.example1;

public class MyThread extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is my thread.");
        }
    }
}

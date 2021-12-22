package introduction.example3;

public class ExecuteIntroExam3 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sleep");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

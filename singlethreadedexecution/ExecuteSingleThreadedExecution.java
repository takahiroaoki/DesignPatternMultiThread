package singlethreadedexecution;

public class ExecuteSingleThreadedExecution {
    
    public static void main(String[] args) {
        // Push "CTRL + C" when you want to stop this program.
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }   
}

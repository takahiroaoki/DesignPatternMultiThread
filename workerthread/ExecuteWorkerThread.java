package workerthread;

public class ExecuteWorkerThread {
    
    // Push "CTRL + C" when you want to stop this program.
    public static void main(String[] args) {
        Channel channel = new Channel(5);// WorkerThreadの個数
        channel.startWorkers();
        new ClientThread("Alice", channel).start();
        new ClientThread("Bob", channel).start();
        new ClientThread("Chris", channel).start();
    }
}

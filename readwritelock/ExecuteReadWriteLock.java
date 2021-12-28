package readwritelock;

public class ExecuteReadWriteLock {
    // Push "CTRL + C" when you want to stop this program.
    public static void main(String[] args) {
        Data data = new Data(10);
        Thread[] threads = {
            new ReaderThread(data),
            new ReaderThread(data),
            new ReaderThread(data),
            new ReaderThread(data),
            new WriterThread(data, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
            new WriterThread(data, "abcdefghijklmnopqrstuvwxyz"),
        };
        for (Thread t: threads) {
            t.start();
        }
    }
}

package twophasetermination;

public class CountupThread extends Thread {
    
    private long counter = 0;
    private volatile boolean shutdownRequested = false;

    public void shutdownRequest() {
        shutdownRequested = true;
        interrupt();
    }

    public boolean isShutdownRequested() {
        return shutdownRequested;
    }

    @Override
    public final void run() {
        try {
            while (!isShutdownRequested()) {
                doWork();
            }
        } finally {
            doShutdown();
        }
    }

    private void doWork() {
        counter++;
        System.out.println("doWork: counter = " + counter);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }
}

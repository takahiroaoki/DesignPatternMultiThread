package future;

public class FutureData implements Data {
    
    private RealData realData = null;
    private boolean ready = false;

    public synchronized void setRealData(RealData realData) {
        // balking pattern
        if (ready) {
            return;
        }
        this.realData = realData;
        this.ready = true;
        notifyAll();
    }

    public synchronized String getContent() {
        // guarded suspension pattern
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.getContent();
    }
}

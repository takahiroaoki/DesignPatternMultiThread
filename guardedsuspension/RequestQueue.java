package guardedsuspension;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest() {
        while (queue.peek() == null) {
            try {
                // Put the ServerThread into wait-set of the RequestQueue instance.
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        // Notify that the RequestQueue instance changed to other threads.
        notifyAll();
    }
}

package balking;

import java.io.IOException;
import java.util.Random;

public class ChangerThread extends Thread {
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                data.change("No." + i);
                // Sometimes save data manually
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        } catch (IOException|InterruptedException e) {
            e.printStackTrace();
        }
    }
}

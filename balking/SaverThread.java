package balking;

import java.io.IOException;

public class SaverThread extends Thread {
    private final Data data;

    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Periodically save file
                Thread.sleep(1000);
                data.save();
            }
        } catch (IOException|InterruptedException e) {
            e.printStackTrace();
        }
    }
}

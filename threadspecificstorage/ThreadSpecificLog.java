package threadspecificstorage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreadSpecificLog {
    private PrintWriter writer = null;

    // writerフィールドの初期化
    public ThreadSpecificLog(String fileName) {
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(String s) {
        writer.println(s);
    }

    public void close() {
        writer.println("===== End of log =====");
        writer.close();
    }
}

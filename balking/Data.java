package balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
    private final String fileName;
    private String content;
    private boolean isChanged;
    
    public Data(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.isChanged = true;
    }

    // Change content
    public synchronized void change(String newContent) {
        content = newContent;
        isChanged = true;
    }

    // Save content if it is changed
    public synchronized void save() throws IOException {
        if (!isChanged) {
            System.out.println(Thread.currentThread().getName() + " balks the save process.");
            return;
        }
        doSave();
        isChanged = false;
    }

    // Concrete save process
    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}

package readwritelock;

public class Data {
    private final char[] buffer;
    private final ReadWriteLock lock = new ReadWriteLock();

    public Data(int size) {
        this.buffer = new char[size];
        // 初期値は'*'で埋める
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = '*';
        }
    }

    public char[] read() throws InterruptedException {
        lock.readLock();
        try {
            return doRead();
        } finally {
            lock.readUnlock();
        }
    }

    public void write(char c) throws InterruptedException {
        lock.writeLock();
        try {
            doWrite(c);
        } finally {
            lock.writeUnlock();
        }
    }

    private char[] doRead() {
        char[] newBuffer = new char[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            newBuffer[i] = buffer[i];
        }
        slowly();
        return newBuffer;
    }

    private void doWrite(char c) {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            slowly();
        }
    }

    private void slowly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

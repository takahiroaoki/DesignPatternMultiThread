package readwritelock;

public final class ReadWriteLock {
    /**
     * スレッド間の排他制御について、
     * 読む×読む=>不要
     * 読む×書く=>必要
     * 書く×書く=>必要
     */
    private int readingReaders = 0;// 実際に読んでいる最中のスレッドの数 >= 0
    private int waitingWriters = 0;// 書くのを待っているスレッドの数 >= 0
    private int writingWriters = 0;// 実際に書いている最中のスレッドの数 = 0 or 1
    private boolean preferWriter = true;// 書き込みを読み取りより優先させる場合はtrue

    public synchronized void readLock() throws InterruptedException {
        // Guarded Suspension
        while (writingWriters > 0 || (preferWriter && waitingWriters > 0)) {
            wait();
        }

        readingReaders++;
    }

    public synchronized void readUnlock() {
        readingReaders--;
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;
        try {
            // Guarded Suspension
            while (readingReaders > 0 || writingWriters > 0) {
                wait();
            }
        } finally {
            waitingWriters--;
        }
        writingWriters++;
    }

    public synchronized void writeUnlock() {
        writingWriters--;
        preferWriter = false;
        notifyAll();
    }
}

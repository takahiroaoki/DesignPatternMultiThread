package producerconsumer;

public class Table {
    private final String[] buffer;
    private int tail;// 次にputするインデックス
    private int head;// 次にtakeするインデックス
    private int count;// buffer内の（＝tableインスタンス上の）ケーキの数

    public Table(int capacity) {
        this.buffer = new String[capacity];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // ケーキを置くメソッド
    public synchronized void put(String cake) throws InterruptedException {
        // Guarded Suspensionパターン
        //// テーブル上がcapacityいっぱいの時は待機
        while (count >= buffer.length) {
            wait();
        }

        buffer[tail] = cake;
        System.out.println(Thread.currentThread().getName() + " puts " + cake);
        tail = (tail + 1) % buffer.length;
        count++;
        notifyAll();
    }

    // ケーキを取るメソッド
    public synchronized String take() throws InterruptedException {
        // Guraded Suspensionパターン
        //// テーブル上にケーキがない時は待機
        while (count <= 0) {
            wait();
        }

        String cake = buffer[head];
        System.out.println(Thread.currentThread().getName() + " takes " + cake);
        head = (head + 1) % buffer.length;
        count--;
        notifyAll();
        return cake;
    }
}

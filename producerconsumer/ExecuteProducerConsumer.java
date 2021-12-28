package producerconsumer;

public class ExecuteProducerConsumer {
    
    public static void main(String[] args) {
        Table table = new Table(3);

        Thread[] threads = {
            new MakerThread("MakerThread-1", table, 123L),
            new MakerThread("MakerThread-2", table, 456L),
            new MakerThread("MakerThread-3", table, 789L),
            new EaterThread("EaterThread-1", table, 321L),
            new EaterThread("EaterThread-2", table, 654L),
            new EaterThread("EaterThread-3", table, 987L),
        };

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        // 10秒でプログラムを停止
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].interrupt();
        }
    }
}

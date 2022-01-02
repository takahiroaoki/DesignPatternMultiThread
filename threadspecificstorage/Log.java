package threadspecificstorage;

public class Log {
    private static final ThreadLocal<ThreadSpecificLog> tsLogCollection = new ThreadLocal<ThreadSpecificLog>();   

    public static void println(String s) {
        getTSLog().println(s);
    }

    public static void close() {
        getTSLog().close();
    }

    private static ThreadSpecificLog getTSLog() {
        ThreadSpecificLog tsLog = tsLogCollection.get();

        // そのスレッドからの呼び出しが初めてなら新規作成して登録する
        if (tsLog == null) {
            tsLog = new ThreadSpecificLog("threadspecificstorage/" + Thread.currentThread().getName() + "-log.txt");
            tsLogCollection.set(tsLog);
        }

        return tsLog;
    }
}

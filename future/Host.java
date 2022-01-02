public class Host {
    
    public Data request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");

        // FutureDataインスタンスを作る
        final FutureData futureData = new FutureData();

        // RealDataインスタンスを作るための新しいスレッドを起動する
        new Thread() {
            @Override
            public void run() {
                RealData realData = new RealData(count, c);
                futureData.setRealData(realData);
            }
        }.start();

        System.out.println("    request(" + count + ", " + c + ") END");

        return futureData;
    }
}

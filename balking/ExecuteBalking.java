package balking;

public class ExecuteBalking {
    
    public static void main(String[] args) {
        // Push "CTRL + C" when you want to stop this program.
        Data data = new Data("./balking/data.txt", "empty");
        new ChangerThread("Changer", data).start();
        new SaverThread("Saver", data).start();;
    }
}

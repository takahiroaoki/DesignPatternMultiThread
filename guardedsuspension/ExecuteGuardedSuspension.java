package guardedsuspension;

public class ExecuteGuardedSuspension {
    
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Client", 1293580L).start();
        new ServerThread(requestQueue, "Server", 5242354L).start();
    }
}

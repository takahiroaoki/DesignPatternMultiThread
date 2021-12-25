package singlethreadedexecution;

public class Gate {
    
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    private void check() {
        if (name.charAt(0) != name.charAt(0)) {
            System.out.println("***** BROKEN *****" + toString());
        }
    }

    // This method should be "synchronized" because toString() method would usually be "public" and used from other thread.
    public synchronized String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }
}

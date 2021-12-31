package threadpermessage;

class ExecuteThreadPerMessage {

    public static void main(String[] args) {
        System.out.println("main() BEGIN");
        Host host = new Host();
        host.request(30, 'A');
        host.request(20, 'B');
        host.request(10, 'C');
        System.out.println("main() END");
    }
    
}
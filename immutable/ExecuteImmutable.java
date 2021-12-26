package immutable;

public class ExecuteImmutable {
    
    public static void main(String[] args) {
        // Push "CTRL + C" when you want to stop this program.
        Person person = new Person("Alice", "Alaska");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}

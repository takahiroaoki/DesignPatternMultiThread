package introduction.example4;

public class BankAccountOperator implements Runnable {
    private BankAccount account;
    private int withDrawAmount;

    public BankAccountOperator(BankAccount account, int withDrawAmount) {
        this.account = account;
        this.withDrawAmount = withDrawAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < withDrawAmount; i++) {
            System.out.println(account.withdraw1(1));
            // System.out.println(account.withdraw2(1));
        }
    }
}

package introduction.example4;

public class BankAccount {
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    // synchronizedの書き方1
    public synchronized int withdraw1(int m) {
        if (this.money >= m) {
            this.money -= m;
        }
        return this.money;
    }

    // synchronizedの書き方2
    public int withdraw2(int m) {
        // synchronizedで囲った範囲だけを排他範囲にできる。
        synchronized (this) {
            if (this.money >= m) {
                this.money -= m;
            }
            return this.money;
        }
    }
}

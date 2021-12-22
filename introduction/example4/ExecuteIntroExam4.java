package introduction.example4;

public class ExecuteIntroExam4 {

    public static void main(String[] args) {
        // 100円口座にある状態から2つの操作が50円ずつ引き出しているので、排他制御ができていれば丁度0円で終わる。
        BankAccount account = new BankAccount(100);
        BankAccountOperator accountOp = new BankAccountOperator(account, 50);

        Thread thread1 = new Thread(accountOp);
        Thread thread2 = new Thread(accountOp);
        
        thread1.start();
        thread2.start();
    }
}

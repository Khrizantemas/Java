public class Bank {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String[] transactionHistory;
    private int transactionCount;
    private boolean accountLock;

    public Bank(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new String[10];
        this.transactionCount = 0;
        this.accountLock = true;
    }

    public void printTransactionHistory() {
        if (transactionCount == 0) {
            System.out.println("No transaction history availble");
            return;
        }
        for (int i = 0; i < transactionCount; i++) {
            if (transactionHistory[i] != null) {
                System.out.println(transactionHistory[i]);
            }
        }
    }

    public boolean transferMoney(Bank targetAccount, double amount) {
        if (this.accountLock) {
            System.out.println("Account is locked !");
            return false;
        }
        if (amount > 1000) {
            System.out.println("Transfer amount exceeds the limit Is $1000");
            return false;
        }
        if (this.balance < amount) {
            System.out.println("you are not that rich");
            return false;
        }
        this.balance -= amount;
        targetAccount.balance += amount;
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = "Transferred $" + amount + " to " + targetAccount.accountNumber;
        }
        if (targetAccount.transactionCount < targetAccount.transactionHistory.length) {
            targetAccount.transactionHistory[targetAccount.transactionCount++] = "Received $" + amount + " from " + this.accountNumber;
        }
        return true;
    }

    public void lockAccount() {
        this.accountLock = true;
    }

    public void unlockAccount() {
        this.accountLock = false;
    }

    public double calculateDeposit(double amount, int months) {
        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }
}

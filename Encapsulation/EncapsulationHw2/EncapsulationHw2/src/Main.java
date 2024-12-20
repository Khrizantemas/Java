public class Main {
    public static void main(String[] args) {

        Bank acc1 = new Bank("123456", "niangi", 2000);
        Bank acc2 = new Bank("654321", "Bob", 1500);

        acc1.unlockAccount();
        acc2.unlockAccount();

        acc1.transferMoney(acc2, 500);
        acc1.printTransactionHistory();
        acc2.printTransactionHistory();

        double finalAmount = acc1.calculateDeposit(1000, 6);
        System.out.println("Final amount after 6 months: $" + finalAmount);

        acc1.lockAccount();
        acc1.transferMoney(acc2, 200);
    }
}

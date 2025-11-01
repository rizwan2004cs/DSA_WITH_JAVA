package Bank;
public class Main {

    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount(21081, 5000, 7.3);
        CheckingAccount cheAcc = new CheckingAccount(21082, 100000, 14000);
        FD fdAcc = new FD(21083, 1000000, 10, 7);
        System.out.println("Saving account");
        savAcc.deposit(500);
        savAcc.withdraw(1000);
        savAcc.displayBalance();

        cheAcc.deposit(500);
        cheAcc.withdraw(108000);
        cheAcc.displayBalance();

        fdAcc.deposit(500);
        fdAcc.withdraw(1000);
        fdAcc.displayBalance();
        System.out.println(fdAcc.calculateMaturityAmount() + " is the maturity amount");
    }
}
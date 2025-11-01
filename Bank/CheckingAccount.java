package Bank;

class CheckingAccount extends Account {

    double overDraftLimit;

    CheckingAccount(int accNo, double balance, double overDraftLimit) {
        super(accNo, balance);
        this.overDraftLimit = overDraftLimit;
    }

    // double overDraftLimit;
    void withdraw(double amount) {
        if (this.balance + this.overDraftLimit < amount) {
            System.out.println("Low balance unable to withdraw");
        } else {
            balance -= amount;
            System.out.println(amount + " withdraw from account");
        }
    }
}
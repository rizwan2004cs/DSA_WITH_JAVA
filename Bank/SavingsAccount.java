package Bank;

class SavingsAccount extends Account {

    double interestRate;

    public SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        // super.balance += super.balance * interestRate/100;
        super.deposit(super.balance * interestRate / 100);
    }
}
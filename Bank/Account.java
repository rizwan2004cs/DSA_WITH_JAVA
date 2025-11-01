package Bank;

class Account {

    int accountNumber;
    double balance;

    Account(int accNo, double balance) {
        this.balance = balance;
        this.accountNumber = accNo;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited into the account");
    }

    void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Low balance unable to withdraw");
        } else {
            balance -= amount;
            System.out.println(amount + " withdraw from account");
        }
    }

    void displayBalance() {
        System.out.println("The balance in your account is " + this.balance);

    }
}
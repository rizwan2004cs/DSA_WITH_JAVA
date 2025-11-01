
//Account
class Account{
    int accountNumber ;
    double balance;
    Account(int accNo,double balance){  
        this.balance = balance;
        this.accountNumber = accNo;
    }
    void deposit(double  amount){
        balance += amount;
        System.out.println(amount+" deposited into the account");
    }
    void withdraw(double amount){
        if(this.balance < amount){
            System.out.println("Low balance unable to withdraw");
        }else{
            balance -= amount;
            System.out.println(amount+" withdraw from account");
        }
    }
    void displayBalance(){
            System.out.println("The balance in your account is "+this.balance);

    }
}

//SavingsAccount
class SavingsAccount extends Account{
    double interestRate;
    public SavingsAccount(int accNo,double balance,double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }
    
    void addInterest(){
        // super.balance += super.balance * interestRate/100;
        super.deposit(super.balance * interestRate/100);
    }
}


//CheckingAccount
class CheckingAccount extends Account{
    double overDraftLimit;
    CheckingAccount(int accNo,double balance,double overDraftLimit) {
        super(accNo,balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    // double overDraftLimit;
    void withdraw(double amount){
         if(this.balance+this.overDraftLimit < amount){
            System.out.println("Low balance unable to withdraw");
        }else{
            balance -= amount;
            System.out.println(amount+" withdraw from account");
        }
    }
}


//FD
class FD extends Account{
    int termsInYears;
    double FDInterestRate;
    FD(int accNo,double balance,double FDInterestRate,int termsInYears){
        super(accNo,balance);
        this.FDInterestRate = FDInterestRate;
        this.termsInYears = termsInYears;
    }

    double calculateMaturityAmount(){
        double maturity = super.balance+(super.balance*FDInterestRate*termsInYears);
        return maturity;
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount(21081,5000,7.3);
        CheckingAccount cheAcc = new CheckingAccount(21082,100000,14000);
        FD fdAcc = new FD(21083,1000000,10,7);
        savAcc.deposit(500);
        savAcc.withdraw(1000);
        savAcc.displayBalance();
        
        cheAcc.deposit(500);
        cheAcc.withdraw(108000);
        cheAcc.displayBalance();

        fdAcc.deposit(500);
        fdAcc.withdraw(1000);
        fdAcc.displayBalance();
        System.out.println(fdAcc.calculateMaturityAmount());
    }
}
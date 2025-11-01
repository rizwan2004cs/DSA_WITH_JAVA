package Bank;

class FD extends Account {

    int termsInYears;
    double FDInterestRate;

    FD(int accNo, double balance, double FDInterestRate, int termsInYears) {
        super(accNo, balance);
        this.FDInterestRate = FDInterestRate;
        this.termsInYears = termsInYears;
    }

    double calculateMaturityAmount() {
        double maturity = super.balance + (super.balance * FDInterestRate * termsInYears);
        return maturity;
    }
}
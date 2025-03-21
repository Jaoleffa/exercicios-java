package entities;

public class BusinessAccount extends Account {
    private Double loanLimite;

    public BusinessAccount() {

    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimite) {
        super(number, holder, balance); //Construtor da super classe account
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan (double amount) {
        if (amount <= loanLimite) {
            balance += amount - 10.00;
        }
        loanLimite -= amount;
    }

    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount); //O super pega a mesma implementação da super classe
        balance -= 2.0; // Aqui damos o próprio toque
    }
}

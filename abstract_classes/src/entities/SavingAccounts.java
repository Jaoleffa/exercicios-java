package entities;

public class SavingAccounts extends Account{

    protected Double interestRate;

    public SavingAccounts() {
        super();
    }

    public SavingAccounts(int number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) { //Sobreposição de métodos, final aqui também evita herdar
        balance -= amount;
    }


}

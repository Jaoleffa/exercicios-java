package models.services;

public class UsaInterestService implements InterestService{
    protected double taxa;

    public UsaInterestService (double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getInterestRate() {
        return taxa;
    }
}

package models.services;

public class BrazilInterestService implements InterestService{
    protected double taxa;

    public BrazilInterestService (double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getInterestRate() {
        return taxa;
    }
}

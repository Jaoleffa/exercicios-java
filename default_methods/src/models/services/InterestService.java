package models.services;

public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        if (months < 1) {
            System.out.println("Quantidade de meses deve ser maior que zero");
        }
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    }
}

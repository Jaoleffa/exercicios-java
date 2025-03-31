package models.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    protected int number;
    protected LocalDate date;
    protected double totalValue;

    protected List<Installment> parcelas = new ArrayList<>();

    public Contract() {

    }

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void addInstallment(Installment parcela) {
        parcelas.add(parcela);
    }

    public void removeInstallment(Installment parcela) {
        parcelas.remove(parcela);
    }

    public List<Installment> getParcelas() {
        return parcelas;
    }
}

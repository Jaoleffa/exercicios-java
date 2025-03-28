package models.entities;

import models.exceptions.DomainException;

public class Account {
    protected int number;
    protected String holder;
    protected double balance;
    protected double withdrawLimit;

    public Account() {

    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        if(balance < 0) {
            throw new DomainException("Conta não pode ser iniciada com saldo negativo!");
        } else if(withdrawLimit < 0) {
            throw new DomainException("Conta não pode ser iniciada com limite negativo");
        } else {
            this.number = number;
            this.holder = holder;
            this.balance = balance;
            this.withdrawLimit = withdrawLimit;
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > getBalance()) {
            throw new DomainException("Valor desejado maior do que existe em conta!");
        } else if (amount > withdrawLimit) {
            throw  new DomainException("Valor desejado maior que o limite possível");
        }
        this.balance -= amount;
    }
}

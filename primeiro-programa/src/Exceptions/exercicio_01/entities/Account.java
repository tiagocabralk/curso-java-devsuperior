package Exceptions.exercicio_01.entities;

import Exceptions.exercicio_01.exeptions.SaldoNegativoExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws SaldoNegativoExceptions {
        if (amount > withdrawLimit) {
            throw new SaldoNegativoExceptions("Erro! Você não pode sacar valores acima do limite de saque.");
        } else if  (amount > balance){
            throw new SaldoNegativoExceptions("Erro! Não pode sacar mais do que o valor do saldo.");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "New balance $ " + balance;
    }
}

package exercicio_banco.entities;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta () {
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Conta (int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo = (this.saldo - valor) - 5.00;
    }

    @Override
    public String toString() {
        return "Account "
                + numeroConta +
                ", Holder: "
                + nomeTitular
                + String.format(", Balance: U$ %.2f", saldo);
    }
}

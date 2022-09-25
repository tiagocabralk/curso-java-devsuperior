package exercicio2.entities;

public class Employee {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    public void aumentoPorcentagem(double porcentagem) {
        this.salarioBruto += this.salarioBruto * porcentagem / 100;
    }

    @Override
    public String toString() {
        return String.format("%s, R$ %.2f%n", nome, salarioLiquido());
    }
}

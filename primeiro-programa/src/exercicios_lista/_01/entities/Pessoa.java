package exercicios_lista._01.entities;

import java.util.Arrays;

public class Pessoa {
    private Integer id;
    private String nome;
    private Double salario;

    public Pessoa(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void recebeAumento(Double percentual) {
        double taxa = getSalario() * percentual / 100;
        salario += taxa;
    }

    @Override
    public String toString() {
        return id
               + ", "
               + nome
               + ", U$ "
               + String.format("%.2f%n" , salario);
    }
}

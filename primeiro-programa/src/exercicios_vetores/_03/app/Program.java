package exercicios_vetores._03.app;

import exercicios_vetores._03.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidade];

        for (int i=0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0.0;
        double menor16 = 0.0;

        for (int i=0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                menor16 += 1.0;
            }
            somaAltura += pessoas[i].getAltura();
        }

        double mediaAltura = somaAltura / pessoas.length;
        double porcentagem = menor16 * 100 / pessoas.length;

        System.out.println();
        System.out.printf("Altura média: %.2f%n" , mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem);
        System.out.println();

        for (int i=0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}

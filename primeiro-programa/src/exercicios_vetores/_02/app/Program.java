package exercicios_vetores._02.app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidade = sc.nextInt();

        double[] vet = new double[quantidade];

        for(int i=0; i< vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;

        for(int i=0; i< vet.length; i++) {
            soma += vet[i];
            media = soma / vet.length;
        }

        System.out.print("VALORES = ");
        for(int i=0; i< vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.printf("SOMA = %.2f%n" , soma);
        System.out.printf("MÉDIA = %.2f%n" , media);


    }
}

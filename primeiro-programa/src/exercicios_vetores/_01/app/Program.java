package exercicios_vetores._01.app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidade = sc.nextInt();

        int[] vet = new int[quantidade];
        for(int i=0; i< vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMERO NEGATIVOS:");

        for(int i=0; i< vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
    }
}

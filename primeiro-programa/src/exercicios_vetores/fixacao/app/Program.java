package exercicios_vetores.fixacao.app;

import exercicios_vetores.fixacao.entities.Aluguel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many will be rented? ");
        int qtdPessoas = sc.nextInt();

        Aluguel[] quartos = new Aluguel[10];

        for (int i = 0; i < qtdPessoas; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numQuarto = sc.nextInt();

            quartos[numQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i=0; i< quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }
        sc.close();
    }
}

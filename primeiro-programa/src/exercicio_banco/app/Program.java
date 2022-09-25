package exercicio_banco.app;

import exercicio_banco.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt(); sc.nextLine();

        System.out.print("Enter account holder: ");
        String user = sc.nextLine();

        System.out.print("Is there initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        Conta conta;

        if (resposta == 'y') {
            System.out.print("Enter initial value: U$ ");
            double dInicial = sc.nextDouble();
            conta = new Conta(account, user, dInicial);
        } else if (resposta == 'n') {
            conta = new Conta(account, user);
        } else {
            conta = new Conta();
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a deposit value: U$ ");
        conta.deposito(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a withdraw value: U$ ");
        conta.saque(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(conta);
        System.out.println();

        sc.close();
    }
}

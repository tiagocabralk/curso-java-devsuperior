package Exceptions.exercicio_01.app;

import Exceptions.exercicio_01.entities.Account;
import Exceptions.exercicio_01.exeptions.SaldoNegativoExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account conta = new Account(accountNumber, holderName, initialBalance, withdrawLimit);

        try {
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            conta.withdraw(withdraw);
            System.out.println(conta);
        } catch (SaldoNegativoExceptions e) {
            System.out.printf("Mensagem: " + e.msg);
        }

    }
}

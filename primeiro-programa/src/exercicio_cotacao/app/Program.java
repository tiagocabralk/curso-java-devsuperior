package exercicio_cotacao.app;

import exercicio_cotacao.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? U$ ");
        double cotacao = sc.nextDouble();
        System.out.print("How many dollars will be bought? U$ ");
        double dollar = sc.nextDouble();

        double total = CurrencyConverter.converter(cotacao, dollar);

        System.out.printf("Amount to be paid in reais = R$ %.2f%n" , total);
    }
}

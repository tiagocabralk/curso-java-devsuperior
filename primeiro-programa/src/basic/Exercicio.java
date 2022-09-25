package basic;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int consumo = sc.nextInt();
        double mensalidade = 50.00;

        if (consumo > 100) {
            mensalidade += (consumo - 100) * 2;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n" , mensalidade);

        sc.close();
    }
}

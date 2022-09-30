package exercicio_polimorfismo.exercicio_03.app;

import exercicio_polimorfismo.exercicio_03.entities.Pessoa;
import exercicio_polimorfismo.exercicio_03.entities.PessoaFisica;
import exercicio_polimorfismo.exercicio_03.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: $ ");
            double income = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: $ ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new PessoaJuridica(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoa p : list) {
            System.out.printf(p.getNome() + ": $ " + String.format("%.2f%n", p.impostoPago()));
        }

        System.out.println();
        System.out.print("TOTAL TAXES:");

        double sum = 0.0;
        for (Pessoa p : list) {
            sum += p.impostoPago();
        }

        System.out.printf(String.format(" $ %.2f ", sum));

    }
}

package exercicio2.app;

import exercicio2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.nome = sc.nextLine();
        System.out.print("Gross Salary: R$ ");
        employee.salarioBruto = sc.nextDouble();
        System.out.print("Tax: R$ ");
        employee.imposto = sc.nextDouble();

        System.out.print("Employee: " + employee);
        System.out.print("Which percentage to increase salary? ");
        employee.aumentoPorcentagem(sc.nextDouble());
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}

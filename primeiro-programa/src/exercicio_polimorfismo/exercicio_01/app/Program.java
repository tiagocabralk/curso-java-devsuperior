package exercicio_polimorfismo.exercicio_01.app;

import exercicio_polimorfismo.exercicio_01.entities.Employee;
import exercicio_polimorfismo.exercicio_01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char response = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();;
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (response == 'y' || response == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hour, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.toString());
        }

        sc.close();
    }
}

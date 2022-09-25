package exercicio_enumeracoes.exercicio_01.app;

import exercicio_enumeracoes.exercicio_01.entities.HourContract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: U$ ");
        Double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker: ");
        int cont = sc.nextInt();

        HourContract[] contract = new HourContract[cont];
        LocalDate data;

        for (int i = 0; i < contract.length; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            data = LocalDate.parse(sc.next(), format);
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hour): ");
            int duration = sc.nextInt();
            contract[i] = new HourContract(data, valuePerHour, duration);
        }

        for (int i = 0; i < contract.length; i++) {
            System.out.println(contract[i]);
        }
    }
}

package exercicio_enumeracoes.exercicio_01.app;

import exercicio_enumeracoes.exercicio_01.entities.Department;
import exercicio_enumeracoes.exercicio_01.entities.HourContract;
import exercicio_enumeracoes.exercicio_01.entities.Worker;
import exercicio_enumeracoes.exercicio_01.entities.WorkerLevel;

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
        Department department = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: U$ ");
        Double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker: ");
        int cont = sc.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        HourContract[] contract = new HourContract[cont];
        LocalDate data;

        for (int i = 0; i < contract.length; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            data = LocalDate.parse(sc.next(), format);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hour): ");
            int duration = sc.nextInt(); sc.nextLine();
            contract[i] = new HourContract(data, valuePerHour, duration);
            worker.addContract(contract[i]);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dataBusca = sc.next();
        int mes = Integer.parseInt(dataBusca.substring(0,2));
        int ano = Integer.parseInt(dataBusca.substring(3));


        System.out.println();
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + dataBusca + ": " + String.format("%.2f%n", worker.income(ano, mes)));

        sc.close();
    }
}

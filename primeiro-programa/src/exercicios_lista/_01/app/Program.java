package exercicios_lista._01.app;

import exercicios_lista._01.entities.Pessoa;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int response = sc.nextInt();

        List<Pessoa> lista = new ArrayList<>();

        for (int i = 0; i < response; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Salary: U$ ");
            Double salario = sc.nextDouble();

            Pessoa pessoa = new Pessoa(id, nome, salario);
            lista.add(pessoa);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int buscaId = sc.nextInt();

        Integer pos = posicao(lista, buscaId);

        if (pos == null) {
            System.out.println("This is does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            lista.get(pos).recebeAumento(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Pessoa funcionario : lista) {
            System.out.print(funcionario);
        }

        sc.close();
    }

    public static Integer posicao(List<Pessoa> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

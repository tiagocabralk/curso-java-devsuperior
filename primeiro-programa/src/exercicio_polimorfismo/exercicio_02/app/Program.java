package exercicio_polimorfismo.exercicio_02.app;

import exercicio_polimorfismo.exercicio_02.entities.ImportedProduct;
import exercicio_polimorfismo.exercicio_02.entities.Product;
import exercicio_polimorfismo.exercicio_02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int  n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: $ ");
            double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Custom free: $ ");
                double customFree = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFree);
                list.add(product);
            } else if (ch == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String d = sc.nextLine();
                LocalDate date = LocalDate.parse(d, formatter);
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            } else {
                sc.nextLine();
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product l : list) {
            System.out.println(l.priceTag());
        }

    }
}

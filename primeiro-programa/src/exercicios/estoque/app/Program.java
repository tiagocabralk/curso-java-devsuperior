package exercicios.estoque.app;

import exercicios.estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: R$ ");
        product.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());
        System.out.println(product);
        System.out.print("Enter the number of products to be removed from stock: ");
        product.RemoveProducts(sc.nextInt());
        System.out.println(product);
    }
}

package exercicio_composicoes.exercicio_03.app;

import exercicio_composicoes.exercicio_03.entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String data = sc.next();
        LocalDate clientBirthDay = LocalDate.parse(data, formatter);
        Client client = new Client(clientName, clientEmail, clientBirthDay);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int item = sc.nextInt();

        for (int i=1; i<=item; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: U$ ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Order order = new Order(LocalDate.now(), OrderStatus.valueOf(status));
            Product product = new Product(productName, productPrice);

            //OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
        }

    }
}

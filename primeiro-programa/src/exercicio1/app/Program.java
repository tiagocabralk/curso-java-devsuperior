package exercicio1.app;

import exercicio1.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();
        System.out.printf("ÁREA = %.2f%n" , retangulo.Area());
        System.out.printf("PERÍMETRO = %.2f%n" , retangulo.Perimetro());
        System.out.printf("DIAGONAL = %.2f%n" , retangulo.Diagonal());
    }
}

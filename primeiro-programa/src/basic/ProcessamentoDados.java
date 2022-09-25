package basic;

import java.util.Locale;
import java.util.Scanner;

public class ProcessamentoDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double pi = 3.14159;
        double areaTriangulo = a * c / 2;
        double areaCiculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n" , areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n" , areaCiculo);
        System.out.printf("TRAPÉZIO: %.3f%n" , areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
        System.out.printf("RETÂNGULO: %.3f%n" , areaRetangulo);

        sc.close();
    }
}

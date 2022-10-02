package Exceptions.app;

import Exceptions.exceptions.ObjetosNulosExeptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ObjetosNulosExeptions {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data = LocalDate.parse(sc.next(), formatter);
            System.out.println(data.format(formatter));
            throw new ObjetosNulosExeptions("Necessita tratar o erro da data");
        } catch (ObjetosNulosExeptions e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizando o Programa");

    }

}

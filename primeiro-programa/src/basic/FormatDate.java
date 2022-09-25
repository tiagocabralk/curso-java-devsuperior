package basic;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormatDate {

	public static void main(String[] args) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		/*LocalDate data01 = LocalDate.now();
		LocalDateTime data02 = LocalDateTime.now();
		Instant data03 = Instant.now();*/
		
//		LocalDate data04 = LocalDate.parse("2022-09-23");
//		LocalDateTime data05 = LocalDateTime.parse("2022-09-23T16:55:30");
//		Instant data06 = Instant.parse("2022-09-23T16:55:30Z");
		Instant data06 = Instant.now();


		
//		LocalDate data07 = LocalDate.parse("23/09/2022", format);

		// Converter data global para local

		LocalDate data08 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
		
//		System.out.println("data01: " + data01.toString());
//		System.out.println("data02: " + data02);
//		System.out.println("data03: " + data03);
//		System.out.println("data04: " + data04);
//		System.out.println("data05: " + data05);
//		System.out.println("data06: " + data06);
//		System.out.println("data07: " + data07);
		System.out.println("data08: " + data08);

	}

}

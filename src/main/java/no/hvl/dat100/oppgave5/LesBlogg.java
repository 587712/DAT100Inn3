package no.hvl.dat100.oppgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

public class LesBlogg {

	private static final String TEKST = "TEKST";
	private static final String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		try {
			System.out.println("Reading file: " + mappe + filnavn);
			File myObj = new File(mappe + filnavn);
			Scanner scanner = new Scanner(myObj);
			int antBloggInnlegg = Integer.parseInt(scanner.nextLine());
			Blogg blogg = new Blogg(antBloggInnlegg);

			int id;
			String bruker;
			String dato;
			String tekst;
			String bilde;
			int likes;

			for (int i = 0; i < antBloggInnlegg; i++) {
				String type = scanner.nextLine();
				System.out.println(type);
				switch (type) {
					case TEKST:
						id = Integer.parseInt(scanner.nextLine());
						bruker = scanner.nextLine();
						dato = scanner.nextLine();
						likes = Integer.parseInt(scanner.nextLine());
						tekst = scanner.nextLine();
						Tekst tekstInnlegg = new Tekst(id, bruker, dato, likes, tekst);
						blogg.leggTil(tekstInnlegg);
						break;
					case BILDE:
						id = Integer.parseInt(scanner.nextLine());
						bruker = scanner.nextLine();
						dato = scanner.nextLine();
						likes = Integer.parseInt(scanner.nextLine());
						tekst = scanner.nextLine();
						bilde = scanner.nextLine();
						Bilde bildeInnlegg = new Bilde(id, bruker, dato, likes, tekst, bilde);
						blogg.leggTil(bildeInnlegg);
						break;
					default:
						System.out.println("Unknown post type: " + type);
						break;
				}
			}
			scanner.close();
			return blogg;
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println("Error parsing number: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
		return null;
	}
}

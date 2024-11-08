package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			FileWriter myFileWriter = new FileWriter(mappe + filnavn);
			myFileWriter.write(samling.toString());
			myFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
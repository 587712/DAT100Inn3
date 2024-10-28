package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		// TODO
		// TODO - START
		try {
			
			PrintWriter output = new PrintWriter(mappe + filnavn);
			
			output.print(samling.toString());
			output.close();
			
			return true;
			
		}
		catch(FileNotFoundException e) {
			
			e.getStackTrace();
			
		}
		
		return false;
		// TODO SLUTT
		
	}
}

package no.hvl.dat100.main;

import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;
import no.hvl.dat100.oppgave5.LesBlogg;

public class main {
    // private static String MAPPE = System.getProperty("user.dir") + "DAT100-innlevering3/dat100-javainnlevering3/src/test/java/no/hvl/dat100/tests/";
    private static String MAPPE = "/Users/mariusphillips/documents/Coding/skole/dat100/EasyGraphics/dat100public/DAT100-Innlevering3/dat100-javainnlevering3/src/test/java/no/hvl/dat100/tests/";

	private static String FILNAVN = "bloggkorrekt.dat";
    public static void main(String[] args) {
        
        Blogg samling = LesBlogg.les(MAPPE, FILNAVN);

		// Tekst innlegg1 = new Tekst(1,"Ole Olsen","23-10","en tekst");
		// Bilde innlegg2 = new Bilde(2,"Oline Olsen","24-10","et bilde","http://www.picture.com/oo.jpg");

        // samling.leggTil(innlegg1);
        // samling.leggTil(innlegg2);

        System.out.println(samling.toString());
    }
}

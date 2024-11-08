package no.hvl.dat100.oppgave6;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX =
	"<html>\n" +
	"\t<head>\n" +
	"\t\t<title>DAT100 Blogg</title>\n" +
	"\t\t<style>\n" +
	"\t\t\tbody { max-width: 800px; margin: auto; }\n" +
	"\t\t</style>\n" +
	"\t</head>\n" +
	"\t<body>\n";
	
	private static String HTMLPOSTFIX =
	"\t</body>\n" +
	"</html>";

	@Override
	public String toString() {
		
		StringBuilder res = new StringBuilder();
		
		res.append(HTMLPREFIX);
		
		for (int i = 0; i < getAntall(); i++) {
			res.append(getSamling()[i].toHTML());
		}
		
		res.append(HTMLPOSTFIX);
		
		return res.toString();
	}
}

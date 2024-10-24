package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	// TODO - START
	String url;
	// TODO SLUTT
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		// TODO
		// TODO - START
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.tekst = tekst;
		this.url = url;
		// TODO SLUTT
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		// TODO
		// TODO - START
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.likes = likes;
		super.tekst = tekst;
		this.url = url;
		// TODO SLUTT
		
	}
	
	public String getUrl() {
		
		// TODO
		// TODO - START
		return url;
		// TODO SLUTT
		
	}

	public void setUrl(String url) {
		
		// TODO
		// TODO - START
		this.url = url;
		// TODO SLUTT
		
	}

	@Override
	public String toString() {
		
		// TODO
		// TODO - START
		String melding = String.format("BILDE\n%s%s\n", super.toString().substring(6), url);
		
		return melding;
		// TODO SLUTT
		
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

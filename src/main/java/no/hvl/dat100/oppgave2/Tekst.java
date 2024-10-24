package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	// TODO - START
	String tekst;
	// TODO SLUTT
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		// TODO
		// TODO - START
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		this.tekst = tekst;
		// TODO SLUTT
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		// TODO
		// TODO - START
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.likes = likes;
		this.tekst = tekst;
		// TODO SLUTT
		
	}
	
	public String getTekst() {
		
		// TODO
		// TODO - START
		return tekst;
		// TODO SLUTT
		
	}

	public void setTekst(String tekst) {
		
		// TODO
		// TODO - START
		this.tekst = tekst;
		// TODO SLUTT
		
	}

	@Override
	public String toString() {
		
		// TODO
		// TODO - START
		String melding = String.format("TEKST\n%s%s\n", super.toString(), tekst);
		
		return melding;
		// TODO SLUTT
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

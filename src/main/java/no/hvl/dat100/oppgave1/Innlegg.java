package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	// TODO - START
	public int id;
	public String bruker;
	public String dato;
	public int likes;
	// TODO SLUTT
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		// TODO SLUTT
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO
		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		// TODO SLUTT
		
	}
	
	public String getBruker() {
		
		// TODO
		// TODO - START
		return bruker;
		// TODO SLUTT

	}

	public void setBruker(String bruker) {

		// TODO
		// TODO - START
		this.bruker = bruker;
		// TODO SLUTT
		
	}

	public String getDato() {

		// TODO
		// TODO - START
		return dato;
		// TODO SLUTT
		
	}

	public void setDato(String dato) {

		// TODO
		// TODO - START
		this.dato = dato;
		// TODO SLUTT
		
	}

	public int getId() {

		// TODO
		// TODO - START
		return id;
		// TODO SLUTT

	}

	public int getLikes() {
		
		// TODO
		// TODO - START
		return likes;
		// TODO SLUTT

	}
	
	public void doLike () {

		// TODO
		// TODO - START
		likes++;
		// TODO SLUTT
		
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		// TODO
		// TODO - START
		if(id == innlegg.getId()) {
			
			return true;
			
		}
		
		return false;
		// TODO SLUTT

	}
	
	@Override
	public String toString() {
		
		// TODO
		// TODO - START
		String melding = String.format("%d\n%s\n%s\n%d\n", id, bruker, dato, likes);
		
		return melding;
		// TODO SLUTT
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

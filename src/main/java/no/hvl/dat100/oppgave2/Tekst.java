package no.hvl.dat100.oppgave2;

import java.util.StringJoiner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private String tekst;

	public Tekst () {}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		StringJoiner res = new StringJoiner("\n");
		res.add("TEKST");
		res.add(String.valueOf(getId()));
		res.add(getBruker());
		res.add(getDato());
		res.add(String.valueOf(getLikes()));
		res.add(this.tekst);
		return res.toString() + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		StringJoiner res = new StringJoiner("\n");
		res.add("\t<p>" + getBruker() + "@" + getDato() + "[" + getLikes() + "]" + "<br>" + this.tekst + "</p>");
		res.add("\t<hr>");
		return res.toString();
				
	}
}

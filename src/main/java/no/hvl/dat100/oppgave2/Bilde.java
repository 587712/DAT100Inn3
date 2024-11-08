package no.hvl.dat100.oppgave2;

import java.util.StringJoiner;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringJoiner res = new StringJoiner("\n");
		res.add("BILDE");
		res.add(String.valueOf(getId()));
		res.add(getBruker());
		res.add(getDato());
		res.add(String.valueOf(getLikes()));
		res.add(getTekst());
		res.add(this.url);
		return res.toString() + "\n";
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		StringJoiner res = new StringJoiner("\n", "\n", "\n");
		res.add("\t<figure>");
		res.add("\t\t<img src=\"" + this.url + "\" alt=\"Bilde\" style=\"width:100%\">");
		res.add("\t\t<figcaption>" + getBruker() + "@" + getDato() + "[" + getLikes() + "]" + getTekst() + "</figcaption>");
		res.add("\t</figure>");
		res.add("\t<hr>");
		return res.toString();
				
	}
}

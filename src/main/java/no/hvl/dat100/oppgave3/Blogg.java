package no.hvl.dat100.oppgave3;

import java.util.StringJoiner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteLedig;

	public Blogg() {
		this.innleggTabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < getAntall(); i++) {
			if (innleggTabell[i].getId() == innlegg.getId()) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < getAntall(); i++) {
			if (innleggTabell[i].getId() == innlegg.getId()) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggTabell.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (innlegg != null && ledigPlass() && !finnes(innlegg)) {
			innleggTabell[nesteLedig++] = innlegg;
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(getAntall()).append("\n"); 
		for (int i = 0; i < getAntall(); i++) { 
			if (innleggTabell[i] != null) { 
				res.append(innleggTabell[i].toString()); 
			}
		}
		return res.toString();
	}
	


	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] utvidetInnleggTabell = new Innlegg[innleggTabell.length * 2];
		for (int i = 0; i < innleggTabell.length; i++) {
			utvidetInnleggTabell[i] = innleggTabell[i];
		}
		innleggTabell = utvidetInnleggTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if (!ledigPlass()) {
			utvid();
		}
		return leggTil(innlegg);
	}
	
	public boolean slett(Innlegg innlegg) {
		if (!finnes(innlegg)) return false;
		int idx = finnInnlegg(innlegg);

		while (idx < innleggTabell.length - 1) {
			innleggTabell[idx] = innleggTabell[idx + 1];
			idx++;
		}
		innleggTabell[idx] = null;
		nesteLedig--;
		return true;
	}
	
	public int[] search(String keyword) {
		//Ikke effektivt, men fungerer!
		int matchCount = 0;
		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i].toString().contains(keyword)) {
				matchCount++;
			}
		}
		int[] matches = new int[matchCount];
		int idx = 0;
		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i].toString().contains(keyword)) {
				matches[idx] = innleggTabell[i].getId();
				idx++;
			}
		}
		return matches;
	}
}
package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	// TODO - START
	Innlegg[] innleggtabell;
	int nesteledig;
	// TODO SLUTT

	public Blogg() {
		
		// TODO
		// TODO - START
		innleggtabell = new Innlegg[20];
		// TODO SLUTT
		
	}

	public Blogg(int lengde) {
		
		// TODO
		// TODO - START
		innleggtabell = new Innlegg[lengde];
		// TODO SLUTT
		
	}

	public int getAntall() {
		
		// TODO
		// TODO - START
		int antall = 0;
		
		for(Innlegg i : innleggtabell) {
			
			if(!(i == null)) {
				
				antall++;
				
			}
			
		}
		
		return antall;
		// TODO SLUTT
		
	}
	
	public Innlegg[] getSamling() {
		
		// TODO
		// TODO - START
		return innleggtabell;
		// TODO SLUTT
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		// TODO
		// TODO - START
		if(innleggtabell.length > 0) {
			
			for(int i = 0; i < innleggtabell.length; i++) {
				
				if(innleggtabell[i] != null) {
					
					if(innleggtabell[i].erLik(innlegg)) {
						
						return innleggtabell[i].getId();
						
					}
					
				}
				
			}
			
		}
		
		return -1;
		// TODO SLUTT
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		// TODO
		// TODO - START
		boolean temp = (finnInnlegg(innlegg) == -1) ? (false) : (true);
		
		return temp;
		// TODO SLUTT
		
	}

	public boolean ledigPlass() {
		
		// TODO
		// TODO - START
		for(int i = 0; i < innleggtabell.length; i++) {
			
			if(innleggtabell[i] == null) {
				
				nesteledig = i;
				return true;
				
			}
			
		}
		
		return false;
		// TODO SLUTT
		
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		// TODO
		// TODO - START
		if(ledigPlass()) {
			
			if(!(finnes(innlegg))) {
				
				innleggtabell[nesteledig] = innlegg;
				nesteledig++;
				return true;
				
			}
			
		}
		
		return false;
		// TODO SLUTT
		
	}
	
	public String toString() {
		
		// TODO
		// TODO - START
		String melding = String.format("%d\n", innleggtabell.length);
		
		for(Innlegg i : innleggtabell) {
			
			melding += String.format("%s", i.toString());
			
		}
		
		return melding;
		// TODO SLUTT
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg[] temp = new Innlegg[innleggtabell.length * 2];
		
		for(int i = 0; i < innleggtabell.length; i++) {
			
			temp[i] = innleggtabell[i];
			
		}
		
		innleggtabell = temp;
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		
		if(finnes(innlegg)) {
			
			if(nesteledig < innleggtabell.length) {
				
				leggTil(innlegg);
				return true;
				
			}
			else {
				
				utvid();
				leggTil(innlegg);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int id = finnInnlegg(innlegg);
		
		if(!(id == -1)) {
			
			innleggtabell[id - 1] = null;
			return true;
			
		}
		
		return false;
		
	}
	
	public int[] search(String keyword) {
		
		int[] id = new int[innleggtabell.length];
		
		for(int i = 0; i < innleggtabell.length; i++) {
			
			if(innleggtabell[i].toString().contains(keyword)) {
				
				id[i] = innleggtabell[i].getId();
				
			}
			
		}
		
		return id;
		
	}
	
}
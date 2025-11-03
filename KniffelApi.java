package Übungen.KniffelSpiel;

import java.util.ArrayList;

// facade
public class KniffelApi {
	private Spiel spiel;
	
	public void starteSpiel(ArrayList<String> spielernamen, boolean starWarsModus) {
		// TODO: StarWars über Vererbung einbauen?
		spiel = new Spiel(spielernamen);
	}
	
	public Gewinnkarte getGewinnkarte() {
		return spiel.getGewinnkarteAktuellerSpieler();	
	}

	public String getNameAktuellerSpieler() {
		return spiel.getNameAktuellerSpieler();
	}
	
	public int[] wurfDurchführen(String... würfel) {
		return spiel.wurfDurchführen(würfel);
	}

	public boolean punkteEintragen(int kategorie) {
		return spiel.punkteEintragen(kategorie);
	}

	public boolean nächsterSpieler() {
		return spiel.nächsterSpieler();
	}
}

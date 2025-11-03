package Übungen.KniffelSpiel;

import java.util.ArrayList;

public class Spiel {
	private Spieler[] spieler;
	private int spieleranzahl;
	private int aktuellerSpieler;
	private Würfelbecher becher;
	private int rundenzähler;
	private int spielerzähler;

	public Spiel(ArrayList<String> spielernamen) {
		spieleranzahl = spielernamen.size();
		spieler = new Spieler[spieleranzahl];

		for (int i = 0; i < spielernamen.size(); i++) {
			spieler[i] = new Spieler(spielernamen.get(i));
		}

		aktuellerSpieler = (int) (Math.random() * spieleranzahl);
		rundenzähler = 1;
		spielerzähler = 1;

		becher = new Würfelbecher();
		becher.würfle();
	}

	public Gewinnkarte getGewinnkarteAktuellerSpieler() {
		return spieler[aktuellerSpieler].getGewinnkarte();
	}

	public String getNameAktuellerSpieler() {
		return spieler[aktuellerSpieler].getName();
	}

	public int[] wurfDurchführen(String... würfel) {
		if (würfel.length != 0)
			for (String w : würfel) {
				becher.würfleBestimmtenWürfel(Integer.parseInt(w) - 1);
			}

		return becher.getWürfelwerte();
	}

	public boolean punkteEintragen(int kategorie) {
		return spieler[aktuellerSpieler].getGewinnkarte().punkteEintragen(kategorie - 1, becher.getWürfel());
	}

	public boolean nächsterSpieler() {
		aktuellerSpieler = ++aktuellerSpieler % spieleranzahl;

		if (++spielerzähler > spieleranzahl) {
			++rundenzähler;
			spielerzähler = 1;
		}

		return rundenzähler <= spieler[aktuellerSpieler].getGewinnkarte().getKategorieAnzahl();
	}
}

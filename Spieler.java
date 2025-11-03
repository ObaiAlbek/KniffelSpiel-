package Übungen.KniffelSpiel;

public class Spieler {
	private String name;
	private Gewinnkarte gewinnkarte;

	public Spieler(String name) {
		this.name = name;
		this.gewinnkarte = new Gewinnkarte();
	}

	public String getName() {
		return name;
	}

	public Gewinnkarte getGewinnkarte() {
		return gewinnkarte;
	}
}

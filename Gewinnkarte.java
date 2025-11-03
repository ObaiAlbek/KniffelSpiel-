package Übungen.KniffelSpiel;

public class Gewinnkarte {
	private Kategorie[] kategorien;
	private final int KATEGORIE_ANZAHL = 6;
	private int summe;

	public Gewinnkarte() {
		kategorien = new Kategorie[KATEGORIE_ANZAHL];
		summe = 0;

		for (int i = 1; i <= kategorien.length; i++) {
			kategorien[i - 1] = new Kategorie(i);
		}
	}

	public boolean punkteEintragen(int kategorie, Würfel[] würfel) {
		if (!kategorien[kategorie].isOffen())
			return false;

		summe += kategorien[kategorie].punkteEintragen(würfel);

		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		int i = 1;
		for (Kategorie k : kategorien) {
			sb.append(String.format("%2d. %s: ", i++, k.getName()));

			if (k.isOffen())
				sb.append("offen");
			else
				sb.append(k.getPunkte());

			sb.append(System.lineSeparator());
		}

		sb.append(String.format("Summe: %3d Punkte", summe));
		return sb.toString();
	}

	public int getKategorieAnzahl() {
		return KATEGORIE_ANZAHL;
	}
}

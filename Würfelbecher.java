package Übungen.KniffelSpiel;

public class Würfelbecher {
	private final int WÜRFELANZAHL = 5;
	private Würfel[] würfel;

	public Würfelbecher() {
		würfel = new Würfel[5];

		for (int i = 0; i < WÜRFELANZAHL; i++) {
			würfel[i] = new Würfel();
		}
	}

	public void würfle() {
		for (int i = 0; i < WÜRFELANZAHL; i++) {
			würfel[i].würfle();
		}
	}

	public void würfleBestimmtenWürfel(int würfelNummer) {
		würfel[würfelNummer].würfle();
	}

	public int[] getWürfelwerte() {
		int[] würfelwerte = new int[WÜRFELANZAHL];

		for (int i = 0; i < WÜRFELANZAHL; i++) {
			würfelwerte[i] = würfel[i].getAugen();
		}

		return würfelwerte;
	}

	public Würfel[] getWürfel() {
		return würfel;
	}
}

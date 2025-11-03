package Übungen.KniffelSpiel;

public class Kategorie {
	private String name;
	private final int AUGEN;
	private int punkte;

	public Kategorie(int augen) {
		this.AUGEN = augen;
		this.name = this.AUGEN + "er";
		this.punkte = -1;
	}

	public int punkteEintragen(Würfel[] würfel) {
		int punkte = 0;

		for (Würfel w : würfel) {
			if (w.getAugen() == AUGEN)
				punkte += AUGEN;
		}

		this.punkte = punkte;

		return punkte;
	}

	public String getName() {
		return name;
	}

	public int getPunkte() {
		if (punkte == -1)
			return 0;

		return punkte;
	}

	public boolean isOffen() {
		return punkte == -1;
	}
}

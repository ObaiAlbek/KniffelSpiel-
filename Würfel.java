package Übungen.KniffelSpiel;

public class Würfel {
	private final int SEITEN;
	private int augen;

	public Würfel() {
		this(6);
	}

	public Würfel(int seiten) {
		this.SEITEN = seiten;
	}

	public int würfle() {
		augen = 1 + (int) (Math.random() * SEITEN);

		return augen;
	}

	public int getAugen() {
		return augen;
	}
}

package Übungen.KniffelSpiel;

import java.util.ArrayList;
import java.util.Scanner;

public class SpielStart {
	private Scanner kb;
	private KniffelApi api;

	public SpielStart(Scanner kb, KniffelApi api) {
		this.kb = kb;
		this.api = api;
	}

	public void verarbeiteEingabe() {
		ArrayList<String> spielernamen = new ArrayList<>();

		System.out.println("Bitte Spielernamen (max. 6, leere Eingabe für Abbruch) eingeben:");
		System.out.println();

		for (int i = 1; i <= 6; i++) {
			System.out.print("Spieler " + i + ": ");
			String name = kb.nextLine();

			if (name.isEmpty())
				break;

			spielernamen.add(name);
		}

		if (spielernamen.size() == 0) {
			System.out.println("Keine Spieler eingegeben, zurück zum Hauptmenü.");
			return;
		}

		System.out.println(spielernamen.size() + " Mitspieler eingegeben.");
		System.out.println();
		System.out.print("Möchten Sie den StarWars-Modus spielen? (j/n): ");

		String sw = kb.nextLine();

		api.starteSpiel(spielernamen, sw.toLowerCase().equals("j"));

		new SpielrundeSpielen(kb, api).verarbeiteEingabe();
	}
}

package Übungen.KniffelSpiel;

import java.util.Scanner;

public class SpielrundeSpielen {
	private Scanner kb;
	private KniffelApi api;

	public SpielrundeSpielen(Scanner kb, KniffelApi api) {
		this.kb = kb;
		this.api = api;
	}

	public void verarbeiteEingabe() {
		do {
			System.out.print(">>>>>>>>>");
			gewinnkarteAusgeben();

			String[] zuWürfeln = { "1", "2", "3", "4", "5" };

			for (int i = 1; i <= 3; i++) {
				int[] würfelwerte = api.wurfDurchführen(zuWürfeln);
				System.out.print(i + ". Wurf: ");
				for (int w : würfelwerte) {
					System.out.print(w + " ");
				}
				System.out.println();
				System.out.println("         1 2 3 4 5");
				System.out.println();

				if (i == 3)
					break;

				System.out.println("Welche Würfel sollen noch einmal geworfen werden? ");
				System.out.println("Nr. des/der zu werfenden Würfel(s) durch Leerzeichen getrennt eingeben.");
				System.out.println("Eine leere Eingabe, beendet das Würfeln.");
				System.out.print("Eingabe: ");

				String eingabe = kb.nextLine();
				if (eingabe.isEmpty())
					break;

				zuWürfeln = eingabe.split(" ");
			}

			gewinnkarteAusgeben();

			System.out.println("In welcher Kategorie sollen die Punkte eingetragen werden?");
			do {
				System.out.print("> ");
				int kategorie = Integer.parseInt(kb.nextLine());

				if (!api.punkteEintragen(kategorie))
					System.out.println("Kategorie bereits belegt, bitte andere wählen.");
				else
					break;
			} while (false);

			gewinnkarteAusgeben();

		} while (api.nächsterSpieler());

		System.out.println("Spielende!");
		// TODO: Gewinnerprüfung
	}

	private void gewinnkarteAusgeben() {
		System.out.println();
		System.out.println("##################################################");
		System.out.println("Gewinnkarte von " + api.getNameAktuellerSpieler());
		System.out.println(api.getGewinnkarte().toString());
		System.out.println("##################################################");
		System.out.println();
	}
}

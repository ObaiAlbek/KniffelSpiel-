package Übungen.KniffelSpiel;

import java.util.Scanner;

public class TuiMain {
	private KniffelApi api;
	private Scanner kb;

	public static void main(String[] args) {
		System.out.println("Willkommen beim Star-Wars-Kniffel!");

		new TuiMain().hauptmenue();
	}

	public TuiMain() {
		api = new KniffelApi();
		kb = new Scanner(System.in);
	}

	public void hauptmenue() {

		mainLoop: do {
			System.out.println();
			System.out.println("Auswahlmöglichkeiten (Zifferneingabe):");
			System.out.println("1 -> Spiel starten");
			System.out.println("9 -> Spiel beenden");
			System.out.println();
			System.out.print("Eingabe > ");

			switch (kb.nextLine()) {
			case "1" -> new SpielStart(kb, api).verarbeiteEingabe();
			case "9" -> {
				break mainLoop;
			}
			default -> System.out.println("Eingabe nicht erkannt, bitte wiederholen.");
			}

		} while (true);

		System.out.println("Auf Wiedersehen!");
	}
}

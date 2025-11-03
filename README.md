# 🎲 KniffelSpiel – Java Console Game

Ein vollständiges **Kniffel- (Yahtzee-) Spiel** in **Java**, entwickelt als Übungsprojekt zur **Objektorientierung (OOP)**, **Spiellogik**, **Zufallszahlenverarbeitung** und **Konsoleninteraktion**.

---

## 🗂️ Projektstruktur

```

KniffelSpiel/
├── Gewinnkarte.java        # Verwaltung der Spiel- und Punktetabelle
├── Kategorie.java          # Aufzählung / Definition der möglichen Kategorien (z. B. Dreierpasch, Full House)
├── KniffelApi.java         # Zentrale Schnittstelle zum Spielablauf
├── Spiel.java              # Hauptspiel-Logik (Regeln, Punkteberechnung, Spielzustände)
├── Spieler.java            # Klasse für die Spieler (Name, Punkte, Runden)
├── SpielrundeSpielen.java  # Ablauf einer kompletten Runde (Würfeln, Wählen, Punkte)
├── SpielStart.java         # Einstiegspunkt zur Initialisierung des Spiels
├── TuiMain.java            # Textbasierte Benutzeroberfläche (TUI)
├── Würfel.java             # Einzelner Würfel (mit Zufallswert 1–6)
├── Würfelbecher.java       # Würfelbecher zur Handhabung mehrerer Würfel
└── README.md               # Projektdokumentation

````

---

## 🧠 Lernziele

- Anwendung der **objektorientierten Prinzipien** (Kapselung, Vererbung, Polymorphie)  
- Einsatz von **Zufallszahlen** zur Simulation von Würfeln  
- Implementierung eines **Konsolenspiels** mit logischem Spielfluss  
- Nutzung von **Klassenbeziehungen** (z. B. Spieler ↔ Spielrunde ↔ Gewinnkarte)  
- Strukturierte Trennung von Spiellogik und Benutzeroberfläche  

---

## 🧩 Spielbeschreibung

Das Ziel ist es, durch Würfeln bestimmte Kombinationen zu erreichen, um möglichst viele Punkte zu sammeln.  
Das Spiel folgt den klassischen **Kniffel-Regeln**:

- Der Spieler würfelt **bis zu drei Mal pro Runde**.  
- Nach jedem Wurf kann der Spieler entscheiden, **welche Würfel behalten** und **welche neu geworfen** werden.  
- Am Ende einer Runde wird eine **Kategorie** gewählt (z. B. „Viererpasch“, „Full House“, „Chance“).  
- Das Spiel endet, wenn alle Kategorien einmal belegt wurden.  
- Die **Gesamtpunktzahl** ergibt sich aus der Summe aller Kategorien.  

---

## ⚙️ Features

✅ Würfelsimulation mit Zufallszahlen  
✅ Dynamische Gewinnkarte und Punktezuteilung  
✅ Mehrspieler-Unterstützung  
✅ Textbasierte Benutzeroberfläche (TUI)  
✅ Trennung von Spiellogik und UI  
✅ Sauber strukturierte Klassenarchitektur  

---

## ▶️ Ausführung

Kompiliere und starte das Spiel über die Konsole:

```bash
javac *.java
java TuiMain
````

Oder öffne das Projekt in einer IDE (z. B. IntelliJ IDEA, Eclipse, VS Code) und starte die Klasse `TuiMain`.

---

## 💡 Erweiterungsideen

* 🖥️ GUI-Version mit Swing oder JavaFX
* 💾 Highscore-System (z. B. Punkte in Datei speichern)
* 🎯 KI-Gegner für Einzelspieler-Modus
* 🔊 Soundeffekte und Animationen
* 🌐 Netzwerkmodus für Multiplayer

---

## 📸 Beispielausgabe (Konsole)

```text
🎲 Willkommen zu Kniffel! 🎲

Spieler 1: Obai
Wurf 1: [2] [4] [4] [1] [6]
Behalte Würfel? (j/n):
Wurf 2: [4] [4] [4] [2] [5]

Kategorie wählen:
1. Dreierpasch
2. Full House
3. Chance
> 1

Erzielte Punkte: 12
```

---

## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Stack;

public class KlammerChecker extends JFrame {
	private JTextArea input; // Eingabefeld für den zu prüfenden Text
	private JPanel panel;    // Haupt-Panel für die GUI
	private JTable output;   // Tabelle für die Darstellung der Ergebnisse (noch nicht verwendet)

	public KlammerChecker(String title) throws HeadlessException {
		super(title);

		// Fenster-Eigenschaften setzen
		setSize(800, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setContentPane(panel); // Haupt-Panel als Inhalt setzen

		// DocumentListener hinzufügen, um auf Änderungen im Textbereich zu reagieren
		input.getDocument().addDocumentListener(new InputListener(this));
	}

	/**
	 * Methode zur Überprüfung der Klammer-Syntax im Eingabetext.
	 */
	public void check() {
		String text = input.getText(); // Text aus dem Eingabefeld holen

		HashMap<Integer, Character> map = new HashMap<>(); // Map für fehlerhafte Klammern
		Stack<Character> stack = new Stack<>();           // Stack für offene Klammern

		// Text Zeichen für Zeichen durchlaufen
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i); // Aktuelles Zeichen

			// Prüfen, ob es sich um eine offene Klammer handelt
			if ("([{".contains(currentChar + "")) {
				stack.push(currentChar); // Offene Klammer auf den Stack legen
			}
			// Prüfen, ob es sich um eine geschlossene Klammer handelt
			else if (")]}".contains(currentChar + "")) {
				// Stack leer -> Keine passende offene Klammer vorhanden
				if (stack.isEmpty()) {
					map.put(i, currentChar); // Fehlerhafte Klammer in die Map einfügen
				}
				// Es gibt eine offene Klammer -> Überprüfen, ob sie passt
				else {
					char openBracket = stack.peek(); // Oberste Klammer im Stack
					if ((openBracket == '(' && currentChar == ')') ||
							(openBracket == '[' && currentChar == ']') ||
							(openBracket == '{' && currentChar == '}')) {
						stack.pop(); // Passende Klammer -> Vom Stack entfernen
					} else {
						map.put(i, currentChar); // Fehlerhafte Klammer in die Map einfügen
					}
				}
			}
		}

		// Alle übrig gebliebenen offenen Klammern als Fehler behandeln
		while (!stack.isEmpty()) {
			map.put(input.getText().length(), stack.pop());
		}

		// Fehlerhafte Klammern ausgeben (Debug-Ausgabe)
		System.out.println(map);
	}
}

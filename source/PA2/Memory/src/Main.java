public class Main {
	public static void main(String[] args) {
		Memory memory = new Memory("Memory");

		memory.setVisible(true);
	}
}


//Aufgabe
// Es soll das Spiel Memory in Swing implementiert werden. Für die Bilder können leicht z.B. verschiedene Icons verwendet werden. (Download als 48x48 png)
// Erstellen Sie eine GUI mit dem Editor von IntelliJ mit allen Elementen außer den Memory-Buttons, diese werden dann im Code erstellt, wenn ein neues Spiel gestartet wird.
// Verwenden Sie ein JPanel für den Bereich an dem die Memory-Buttons angezeigt werden sollen.
// Bevor ein Spiel gestartet wird (Start-Button) sollen bis zu vier Namen der Mitspieler eingegeben werden können.
// Zusätzlich soll noch die Anzahl der Paare gewählt werden können (ComboBox, mindestens drei Anzahlen größer als 5 zur Auswahl).
// Die tatsächliche Spieleranzahl wird über die eingegeben Namen ermittelt. Zeigen Sie eine Fehlermeldung an, wenn kein Spielername eingegeben wurde.
// Wenn das Spiel gestartet wird, sollen die passende Anzahl an Buttons im Panel erstellt werden.
// Wenn auf zwei Felder geklickt wurde, sollen diese dauerhaft angezeigt werden wenn sie gleich waren, oder nach 3 Sekunden wieder verdeckt werden. (Timer verwenden)
// Im Spiel soll der aktive Spieler mit Namen angezeigt werden und wie viele korrekte Paare er gefunden hat.
// Wenn alle Paare gefunden wurden, soll der Sieger angezeigt werden und wie viele Versuche insgesamt notwendig waren.
// Die Anwendung soll mit der Fenstergröße skalieren. Verwenden Sie passende Layoutmanger und JPanels um die Steuerelemente anzuordnen.
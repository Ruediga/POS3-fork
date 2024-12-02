package formen;

import java.awt.*;

public class Raute extends Rechteck {

	public Raute(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void paint(Graphics g) {
		// Zeichnen der Seiten des Trapezes
		this.drawLine(g, x, y, x + width / 2, y - width / 2); // Linke Schräge
		this.drawLine(g, x + width / 2, y - width / 2, x + width, y); // Obere horizontale Seite
		this.drawLine(g, x + width, y, x + width / 2, y + width / 2); // Rechte Schräge
		this.drawLine(g, x, y, x + width / 2, y + width / 2);  // Untere Seite
	}
}

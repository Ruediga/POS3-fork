package formen;

import java.awt.*;

public class Polygon extends Form {
	protected int sides;
	protected int angle;

	public Polygon(int x, int y, int sides, int radius) {
		super(x, y);
		if (sides < 3) {
			throw new IllegalArgumentException("A polygon must have at least 3 sides");
		}

		this.sides = sides;
		this.angle = radius;
	}

	@Override
	public void paint(Graphics g) {
		int[] xPoints = new int[sides];
		int[] yPoints = new int[sides];

		// Berechnung der Ecken des Polygons
		for (int i = 0; i < sides; i++) {
			double angle = 2 * Math.PI / sides * i; // Winkel für jede Ecke
			xPoints[i] = x + (int) (this.angle * Math.cos(angle)); // x-Koordinate
			yPoints[i] = y + (int) (this.angle * Math.sin(angle)); // y-Koordinate
		}

		// Zeichnen des Polygons durch Verbinden der Punkte
		for (int i = 0; i < sides; i++) {
			int nextIndex = (i + 1) % sides; // Nächster Punkt (zyklisch)
			drawLine(g, xPoints[i], yPoints[i], xPoints[nextIndex], yPoints[nextIndex]);
		}
	}
}

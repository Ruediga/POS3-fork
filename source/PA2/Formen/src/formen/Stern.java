package formen;

import java.awt.*;

public class Stern extends Polygon {
	private final int innerRadius;

	public Stern(int x, int y, int sides, int radius, int innerRadius) {
		super(x, y, sides, radius);
		if (sides <= 3) {
			throw new IllegalArgumentException("Ein Stern muss min. 3 Seiten haben");
		}

		this.innerRadius = innerRadius;
	}

	@Override
	public void paint(Graphics g) {
		int edges = sides * 2;
		int[] xPoints = new int[edges];
		int[] yPoints = new int[edges];

		// calculate edges of the polygon
		boolean isOuterPoint = true; // start with outer edge
		for (int i = 0; i < edges; i++) {
			int currentRadius = isOuterPoint ? angle : innerRadius;

			// calculate angle
			double angle = 2 * Math.PI * i / edges;

			// calculate coordinates
			xPoints[i] = x + (int) (currentRadius * Math.cos(angle));
			yPoints[i] = y + (int) (currentRadius * Math.sin(angle));

			// switch edge type
			isOuterPoint = !isOuterPoint;
		}

		// draw polygon through connecting points
		for (int i = 0; i < edges; i++) {
			int nextIndex = (i + 1) % edges; // next point
			drawLine(g, xPoints[i], yPoints[i], xPoints[nextIndex], yPoints[nextIndex]);
		}
	}
}

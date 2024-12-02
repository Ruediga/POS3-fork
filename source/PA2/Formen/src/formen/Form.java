package formen;

import java.awt.*;

public abstract class Form {
	protected int x;
	protected int y;

	public Form(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void paint(Graphics g);

	protected final void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
		g.drawLine(x1, y1, x2, y2);
	}

	protected final void drawOval(Graphics g, int x1, int y1, int w, int h) {
		g.drawOval(x1, y1, w, h);
	}
}

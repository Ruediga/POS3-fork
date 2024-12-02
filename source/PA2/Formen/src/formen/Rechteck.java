package formen;

import java.awt.*;

public class Rechteck extends Form {
	protected int width;
	protected int height;

	public Rechteck(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void paint(Graphics g) {
		this.drawLine(g, x, y, x + width, y);
		this.drawLine(g, x + width, y, x + width, y + height);
		this.drawLine(g, x, y + height, x + width, y + height);
		this.drawLine(g, x, y, x, y + height);
	}
}

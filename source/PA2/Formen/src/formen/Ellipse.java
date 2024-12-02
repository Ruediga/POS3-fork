package formen;

import java.awt.*;

public class Ellipse extends Form {
	private final int width;
	private final int height;

	public Ellipse(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void paint(Graphics g) {
		this.drawOval(g, x, y, height + width, height);
	}
}

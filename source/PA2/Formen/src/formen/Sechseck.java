package formen;

public class Sechseck extends Polygon {

	public Sechseck(int x, int y, int sides, int radius) {
		super(x, y, sides, radius);
		this.sides = sides;
		this.angle = radius;
	}
}

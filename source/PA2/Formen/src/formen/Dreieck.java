package formen;

public class Dreieck extends Polygon {

	public Dreieck(int x, int y, int sides, int angle) {
		super(x, y, sides, angle);
		if (sides != 3) {
			throw new IllegalArgumentException("A polygon must have 3 sides");
		}
		this.sides = sides;
		this.angle = angle;
		
	}
}

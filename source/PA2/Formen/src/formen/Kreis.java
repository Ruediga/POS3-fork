package formen;

import java.awt.*;

public class Kreis extends Ellipse {
    private final int width;
    private final int height;

    public Kreis(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        this.drawOval(g, x, y, height + width, height + width);
    }
}

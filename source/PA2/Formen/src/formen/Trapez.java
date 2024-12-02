package formen;

import java.awt.*;

public class Trapez extends Rechteck {
    private final int top_width;

    public Trapez(int x, int y, int top_width, int width, int height) {
        super(x, y, width, height);
        this.top_width = top_width;
    }
    public void paint(Graphics g) {
        // Berechnung der Eckpunkte des Trapezes
        int x_top_left = x + (width - top_width) / 2;  // Zentriert die obere Breite
        int x_top_right = x_top_left + top_width;
        int x_bottom_left = x;
        int x_bottom_right = x + width;
        int y_top = y;
        int y_bottom = y + height;

        // Zeichnen der Seiten des Trapezes
        this.drawLine(g, x_top_left, y_top, x_top_right, y_top);       // Obere Seite
        this.drawLine(g, x_top_left, y_top, x_bottom_left, y_bottom);     // Linke schräge Seite
        this.drawLine(g, x_top_right, y_top, x_bottom_right, y_bottom);   // Rechte schräge Seite
        this.drawLine(g, x_bottom_left, y_bottom, x_bottom_right, y_bottom);  // Untere Seite
    }
}

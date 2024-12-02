package formen;

import javax.swing.*;
import java.awt.Graphics;

public class FormenPanel extends JPanel {
	private final Form[] forms;

	public FormenPanel() {
		forms = new Form[10];
		forms[0] = new Rechteck(100, 100, 200, 100);
		forms[1] = new Quadrat(400, 100, 100);
		forms[2] = new Trapez(600, 100, 200, 250, 100);
		forms[3] = new Raute(900, 100, 100, 100);

		forms[4] = new Polygon(200, 300, 7, 70);
		forms[5] = new Sechseck(450, 300, 6, 60);
		forms[6] = new Stern(700, 300, 9, 100, 50);
		forms[7] = new Dreieck(950, 300, 3, 90);

		forms[8] = new Ellipse(100, 400, 200, 100);
		forms[9] = new Kreis(450, 400, 100, 100);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Form f : forms) {
			if (f != null) f.paint(g);
		}
	}
}

package formen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
	private JPanel mainPanel;
	private JPanel formenPanel;
	private JTextField textField1;

	public MainWindow() throws HeadlessException {
		setTitle("Formen");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(mainPanel);
		setSize(800, 400);

		JMenu fileMenu = new JMenu("Datei");
		fileMenu.setMnemonic('D');
		//formenPanel.add(fileMenu);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		JMenuItem open = new JMenuItem("Öffnen");
		open.setMnemonic('O');
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainPanel, "Öffnen");
			}
		});
		fileMenu.add(open);
		JMenuItem save = new JMenuItem("Speichern");
		save.setMnemonic('S');

		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainPanel, "Speichern");
			}
		});
		save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.ALT_DOWN_MASK + InputEvent.CTRL_DOWN_MASK));
		fileMenu.add(save);

		JRadioButtonMenuItem red = new JRadioButtonMenuItem("red");
		fileMenu.add(red);
		JRadioButtonMenuItem blue = new JRadioButtonMenuItem("blue");
		fileMenu.add(blue);
		JRadioButtonMenuItem green = new JRadioButtonMenuItem("green");
		fileMenu.add(green);
		JRadioButtonMenuItem yellow = new JRadioButtonMenuItem("yellow");
		fileMenu.add(yellow);
		JRadioButtonMenuItem pink = new JRadioButtonMenuItem("pink");
		fileMenu.add(pink);
		ButtonGroup farbenGroup = new ButtonGroup();
		farbenGroup.add(red);
		farbenGroup.add(blue);
		farbenGroup.add(green);
		farbenGroup.add(yellow);
		farbenGroup.add(pink);

		JCheckBoxMenuItem selected = new JCheckBoxMenuItem("Selected");
		selected.setMnemonic('T');
		fileMenu.add(selected);
		JRadioButtonMenuItem form = new JRadioButtonMenuItem("form");
		form.setMnemonic('F');
		fileMenu.add(form);
		JRadioButtonMenuItem Rechteck = new JRadioButtonMenuItem("Rechteck");
		Rechteck.setMnemonic('R');
		fileMenu.add(Rechteck);
		JRadioButtonMenuItem Quadrat = new JRadioButtonMenuItem("Quadrat");
		Rechteck.setMnemonic('Q');
		fileMenu.add(Quadrat);
		JRadioButtonMenuItem Kreis = new JRadioButtonMenuItem("Kreis");
		Kreis.setMnemonic('K');
		fileMenu.add(Kreis);
		JRadioButtonMenuItem Trapez = new JRadioButtonMenuItem("Trapez");
		Trapez.setMnemonic('K');
		fileMenu.add(Trapez);
		JRadioButtonMenuItem Raute = new JRadioButtonMenuItem("Raute");
		Raute.setMnemonic('K');
		fileMenu.add(Raute);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(Rechteck);
		buttonGroup.add(form);
		buttonGroup.add(Quadrat);
		buttonGroup.add(Kreis);
		buttonGroup.add(Trapez);
		buttonGroup.add(Raute);



		formenPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (red.isSelected()) {
					((FormenPanel)formenPanel).setColor(Color.red);
				} else if (blue.isSelected()) {
					((FormenPanel)formenPanel).setColor(Color.blue);
				} else if (green.isSelected()) {
					((FormenPanel)formenPanel).setColor(Color.green);
				} else if (yellow.isSelected()) {
					((FormenPanel)formenPanel).setColor(Color.yellow);
				} else if (pink.isSelected()) {
					((FormenPanel)formenPanel).setColor(Color.pink);
				}
				if (Rechteck.isSelected()) {
					Point p = e.getPoint();
					((FormenPanel)formenPanel).addRechteck(p);
				} else if (Quadrat.isSelected()) {
					Point p = e.getPoint();
					((FormenPanel)formenPanel).addQuadrat(p);
				} else if (Kreis.isSelected()) {
					Point p = e.getPoint();
					((FormenPanel)formenPanel).addKreis(p);
				} else if (Trapez.isSelected()) {
					Point p = e.getPoint();
					((FormenPanel)formenPanel).addTrapez(p);
				} else if (Raute.isSelected()) {
					Point p = e.getPoint();
					((FormenPanel)formenPanel).addRaute(p);
				}
			}
		});

	}

	public static void main(String[] args) {
		MainWindow m = new MainWindow();
		m.setVisible(true);
	}

	private void createUIComponents() {
		// TODO: place custom component creation code here
		formenPanel = new FormenPanel();
	}
}

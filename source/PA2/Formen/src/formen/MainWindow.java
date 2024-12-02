package formen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class MainWindow extends JFrame {
	private JPanel mainPanel;
	private JPanel formenPanel;
	private JTextField textField1;

	public MainWindow() throws HeadlessException {
		setTitle("Formen");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(mainPanel);
		setSize(800, 400);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu dateiMenu = new JMenu("Datei");
		dateiMenu.setMnemonic('D');
		menuBar.add(dateiMenu);
		JMenuItem open = new JMenuItem("Open");
		open.setMnemonic('O');
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		dateiMenu.add(open);
		JMenuItem save = new JMenuItem("Save");
		save.setMnemonic('S');
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainPanel, "Save");
			}
		});
		save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
		dateiMenu.add(save);

		JMenu farbMenu = new JMenu("Farbe");
		farbMenu.setMnemonic('F');
		menuBar.add(farbMenu);

		JMenuItem schwarz = new JMenuItem("Schwarz");
		schwarz.setMnemonic('S');
		schwarz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formenPanel.setBackground(Color.BLACK);
			}
		});
		farbMenu.add(schwarz);

		JMenuItem rot = new JMenuItem("Rot");
		rot.setMnemonic('R');
		rot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formenPanel.setBackground(Color.RED);
			}
		});
		farbMenu.add(rot);

		JMenuItem gruen = new JMenuItem("Gruen");
		gruen.setMnemonic('G');
		gruen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formenPanel.setBackground(Color.GREEN);
			}
		});
		farbMenu.add(gruen);

		JMenuItem blau = new JMenuItem("Blau");
		blau.setMnemonic('B');
		blau.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formenPanel.setBackground(Color.BLUE);
			}
		});
		farbMenu.add(blau);

		JMenuItem gelb = new JMenuItem("Gelb");
		gelb.setMnemonic('G');
		gelb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formenPanel.setBackground(Color.YELLOW);
			}
		});
		farbMenu.add(gelb);
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

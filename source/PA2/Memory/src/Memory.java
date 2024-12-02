import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memory extends JFrame {
	private JTextField textField1;
	private JButton spielStartenButton;
	private JPanel panel;
	private JRadioButton pair5button;
	private JRadioButton pair7button;
	private JRadioButton pair10button;
	private ButtonGroup buttonGroup1;

	private final JRadioButton[] pairButtons = {pair5button, pair7button, pair10button};

	private final CircularLinkedList<String> names = new CircularLinkedList<>();
	private int pairsCount = 10;

	public Memory(String title) {
		super(title);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setContentPane(panel);


		spielStartenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] enteredNames = textField1.getText().split(";");
				for (String enteredName : enteredNames) {
					names.append(enteredName.trim());
				}

				for (JRadioButton pairButton : pairButtons) {
					if (pairButton.isSelected()) {
						pairsCount = Integer.parseInt(pairButton.getText().replace(" Paare", ""));
					}
				}
			}
		});
	}
}

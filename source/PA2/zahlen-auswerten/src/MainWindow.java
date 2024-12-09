import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class MainWindow extends JFrame {
	private JPanel mainPanel;
	private JList occurrenceList;
	private JButton auswertenButton;
	private JTextArea inputArea;
	private JTable numberTable;

	public MainWindow() {
		setTitle("Zahlen Auswerten");
		setContentPane(mainPanel);
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		auswertenButton.addActionListener(e -> {
			String[] input = Arrays.stream(inputArea.getText().replaceAll("([^\\d.]+|\\s{2,}|\\s\\.)", " ").replaceAll("( \\.|\\s{2,}|\\. )", " ").split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
			int[] numbers = new int[input.length];
			for (int i = 0; i < input.length; i++) {
				numbers[i] = Integer.parseInt(input[i]);
			}

			HashMap<Integer, Integer> occurrencesMap = new HashMap<>();
			for (int number : numbers) {
				if (occurrencesMap.containsKey(number)) {
					occurrencesMap.put(number, occurrencesMap.get(number) + 1);
				} else {
					occurrencesMap.put(number, 1);
				}
			}

			occurrenceList.setListData(
				occurrencesMap
					.entrySet()
					.stream()
					.sorted((e1, e2) -> e2.getValue() - e1.getValue())
					.limit(10).map(en -> en.getKey())
					.toArray()
			);
		});

//1 1 1
//2 2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//6 6
//7 7 7
//8 8 8 8
//9 9 9
//10 10 10 10 10
//11 11 11 11

		pack();
	}

	public static void main(String[] args) {
		MainWindow main = new MainWindow();
		main.setVisible(true);
	}
}

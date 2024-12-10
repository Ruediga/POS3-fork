import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Stack;

public class KlammerChecker extends JFrame {
	private JTextArea input;
	private JPanel panel;
	private JTable output;

	public KlammerChecker(String title) throws HeadlessException {
		super(title);

		setSize(800, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setContentPane(panel);

		input.getDocument().addDocumentListener(new InputListener(this));
	}

	public void check() {
		String text = input.getText();

		HashMap<Integer, Character> map = new HashMap<>();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < text.length(); i++) {
			if ("([{".contains(text.charAt(i) + "")) {
				stack.push(text.charAt(i));
			} else if (")]}".contains(text.charAt(i) + "")) {
				if (stack.isEmpty()) {
					map.put(i, text.charAt(i));
				} else if (stack.peek() == '(' && text.charAt(i) == ')') {
					stack.pop();
				} else if (stack.peek() == '[' && text.charAt(i) == ']') {
					stack.pop();
				} else if (stack.peek() == '{' && text.charAt(i) == '}') {
					stack.pop();
				} else {
					map.put(i, text.charAt(i));
				}
			}
		}

		while (!stack.isEmpty()) {
			map.put(input.getText().length(), stack.pop());
		}

		System.out.println(map);
	}
}

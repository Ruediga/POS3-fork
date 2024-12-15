import javax.swing.*;

public class MemoryButton extends JButton {
	private int value = 0;
	private boolean found = false;

	public MemoryButton(int value) {
		this.value = value;
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public int getValue() {
		return value;
	}
}

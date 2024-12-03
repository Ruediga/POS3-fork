import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputListener implements DocumentListener {

	private final KlammerChecker klammerChecker;

	public InputListener(KlammerChecker klammerChecker) {
		this.klammerChecker = klammerChecker;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		klammerChecker.check();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		klammerChecker.check();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
//		System.out.println("changed");
	}
}

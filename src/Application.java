
import java.awt.EventQueue;

import GUI.GUIForm;
import Data.FileIO;

public class Application {
	public static void main(String[] args) {
		// Load persisted bank data before showing the UI
		FileIO.Read();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIForm.login.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

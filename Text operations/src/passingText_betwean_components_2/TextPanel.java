package passingText_betwean_components_2;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{

	private JTextArea textArea;
	
	public TextPanel() {
		
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
		
	}
	
	public void append(String text){
		textArea.append(text);
	}
	

}

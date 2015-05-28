package passingText_betwean_components_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class buttonText extends JFrame{

	private JTextField firstName;
	private JTextField secondName;
	private TextPanel text;	
	private JPanel entryPanel;
	private JButton btn1;
	
	
	
	public buttonText() throws HeadlessException {
		
		setTitle("Text area presentation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(800, 500));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		firstName = new JTextField(20);
		secondName = new JTextField(20);
		text = new TextPanel();		
		btn1 = new JButton("Load text");
		entryPanel = new JPanel();
		
		
		
		entryPanel.setLayout(new FlowLayout());
		entryPanel.add(firstName);
		entryPanel.add(secondName);
		
		add(entryPanel, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		add(btn1, BorderLayout.SOUTH);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.append(firstName.getText() + " "+ secondName.getText() + "\n");
			}
		});
		
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	          public void run() {
	              
	        	  buttonText frame = new buttonText();
	              frame.setVisible(true);
	              
	          }
	      });
		
	}
	
}

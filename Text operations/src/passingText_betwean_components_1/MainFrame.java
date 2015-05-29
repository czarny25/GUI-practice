package passingText_betwean_components_1;

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

/*
 *  This class along with 
 *  	 
 *  	TextPanel class
 *  	EntryPanel class 
 *  
 *   create an example of how to communicate between custom components
 */

public class MainFrame extends JFrame{


	EntryPanel entryPanel;
	TextPanel textPanel;	
	JButton btnLoad;
	
	public MainFrame() throws HeadlessException {
		
		setTitle("Text area presentation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(800, 500));
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		

		entryPanel = new EntryPanel();
		textPanel = new TextPanel();
		btnLoad = new JButton("Load text");

		entryPanel.setTextPanel(textPanel);
		
		add(entryPanel, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btnLoad, BorderLayout.SOUTH);
		
		
		btnLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("This is button from main\n");
//				textPanel.appendText(firstName.getText() + " "+ secondName.getText() + "\n");
			}
		});
		
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	          public void run() {
	              
	        	  MainFrame frame = new MainFrame();
	              frame.setVisible(true);
	              
	          }
	      });
		
	}
	
}

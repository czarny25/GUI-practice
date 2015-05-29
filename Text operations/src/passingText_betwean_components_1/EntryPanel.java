package passingText_betwean_components_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntryPanel extends JPanel implements ActionListener{
	
	JTextField firstName;
	JTextField secondName;
	JButton entryLoad;
	JButton reset;
	TextPanel textPanel;
		
	public EntryPanel(){
		
		firstName = new JTextField(20);
		secondName = new JTextField(20);
		entryLoad = new JButton("Load Text");
		reset = new JButton("Reset Text");
		
		entryLoad.addActionListener(this);
		reset.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(firstName);
		add(secondName);
		add(entryLoad);
		add(reset);
		
	}
	/*
	 *    ***   IMPORTAND  ***
	 *    Before attempt to communicate with another class component 
	 *    must create channel like set methods below
	 */
	
	public void setTextPanel(TextPanel textP){
		this.textPanel = textP;
		
	}

	public void actionPerformed(ActionEvent event) {
		
		JButton btnClicked = (JButton)event.getSource();		
		if (btnClicked == entryLoad) {
			
			String fname = firstName.getText();
			String sname = secondName.getText();
			
			if((!fname.equals("") && !sname.equals(""))){
				
				textPanel.appendText(fname + " " + sname + "\n");
				
				firstName.setText("");
				secondName.setText("");
			}else{
				System.out.println("Fill all data");
				// do nothing
			}			
		}else if (btnClicked == reset){			
			firstName.setText("");
			secondName.setText("");
			
		}
		
		
	}
	
}
















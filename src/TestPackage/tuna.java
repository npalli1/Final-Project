package TestPackage;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tuna extends JFrame{
	
	private JLabel name;
	
	public tuna(){
		super("Airline Application");
		setLayout(new FlowLayout());
		
		name = new JLabel("This is the cool part");
		
		add(name);
	}

}

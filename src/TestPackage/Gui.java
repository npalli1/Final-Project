package TestPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Created by nikhilpalli on 11/14/17.
 */
public class Gui extends JFrame{

    private JButton enterButton;
    private JLabel welcomeMessage;

    public Gui(){
        super("Airplane Application");
        setLayout(new FlowLayout());
        
        welcomeMessage = new JLabel("Welcome to Airline Application");
        add(welcomeMessage);
        
        enterButton = new JButton("Click to Login!");
        add(enterButton);
    

    HandlerClass enterToApp = new HandlerClass();
    enterButton.addActionListener(enterToApp);
    }
}

class HandlerClass implements ActionListener{

    public void actionPerformed(ActionEvent event){
 
    	
        JOptionPane.showInputDialog("Enter Username:",String.format("") );
 
        JOptionPane.showInputDialog("Enter Password",String.format("") );

    }

    public void checkCredentials(String u, String p){
    	
    	String username = "npalli1";
    	String password = "1234";
    	
    	if(u.equals(username) && p.equals(password)){
    		
    		JOptionPane.showMessageDialog(null, "Loging in...");
    	}
    	else
    		JOptionPane.showMessageDialog(null, "Incorrect!");
    }
}
package Engine;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GUI extends JFrame implements ActionListener {
	
	public JFrame Frame;
	public JPanel panel1;
	public JButton button1, button2;
	public JTextField text1;
	
	
	public GUI() {
		
		JFrame frame = new JFrame("Search Engine");
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
	    frame.add(panel1);
	    panel1.setBackground(Color.gray);
	    panel1.setLayout(null);
	    
	    JTextField text1 = new JTextField("enter the phrase");
	    panel1.add(text1);
	    text1.setVisible(true);
	    text1.setBounds(20,100,250,20);
	    text1.addActionListener(this);
	    
	    JButton button1 = new JButton("Search");
	    panel1.add(button1);
	    button1.setVisible(true);
	    button1.setBounds(300,100,100,20);
	    button1.addActionListener(this);
	    
	    JButton button2 = new JButton("Select files");
	    panel1.add(button2);
	    button2.setVisible(true);
	    button2.setBounds(20,20,380,70);
	    button2.addActionListener(this);
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		String input;
		ArrayList<String> inputFiles = new ArrayList<String>();
		
		if (command.equals(button2))
		{
			inputFiles = SelectFiles.FileChooser();
		}
		
		if (command.equals(button1))
		{
			input = text1.getText();
			
			
		}
	}
}

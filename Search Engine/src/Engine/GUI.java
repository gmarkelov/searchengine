package Engine;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {
	
	public JFrame Frame;
	public JPanel panel1;
	public JButton button1;
	public JTextField text1;
	
	
	public GUI() {
		
		JFrame frame = new JFrame("Search Engine");
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
	    frame.add(panel1);
	    panel1.setBackground(Color.gray);
	    panel1.setLayout(null);
	    
	    JTextField text1 = new JTextField();
	    panel1.add(text1);
	    text1.setVisible(true);
	    text1.setBounds(20,50,250,20);
	    text1.addActionListener(this);
	    
	    JButton button1 = new JButton("Search");
	    panel1.add(button1);
	    button1.setVisible(true);
	    button1.setBounds(300,50,100,20);
	    button1.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input;
		
		if (e.getSource() == button1)
		{
			input = text1.getText();
			
			
		}
	}
}

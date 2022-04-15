package Engine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;


public class GUI extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("Search Engine");
	JButton button1 = new JButton("Search");
	JButton button2 = new JButton("Select files");
	JTextField text1 = new JTextField("enter the phrase");
	//ArrayList<String> inputFiles = new ArrayList<String>();
	String inputFile;
	
	
	public GUI() {
		
		Frame();
		TextToSearch();
		SelectFilesButton();
		SearchButton();		
	}
	
	public void Frame()
	{
		frame.setSize(500,500);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void TextToSearch()
	{
	    frame.add(text1);
	    text1.setVisible(true);
	    text1.setBounds(20,100,250,20);
	    text1.addActionListener(this);
	}
	
	public void SelectFilesButton()
	{
	    frame.add(button2);
	    button2.setVisible(true);
	    button2.setBounds(20,20,380,70);
	    button2.setActionCommand("SelectFiles");
	    button2.addActionListener(this);
	}
	
	public void SearchButton()
	{
	    frame.add(button1);
	    button1.setVisible(true);
	    button1.setBounds(300,100,100,20);
	    button1.setActionCommand("SearchText");
	    button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		String input;
		int wordcount = 0;
		
		if (command.equals("SelectFiles"))
		{
			this.inputFile = SelectFiles.FileChooser();
			
			System.out.println(this.inputFile);
			//System.out.println(this.inputFiles.size());
		}
		
		if (command.equals("SearchText"))
		{
			input = text1.getText();
			
			System.out.println(input);
			
			try {
				wordcount = FileProcessor.FileSearch(this.inputFile, input);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("search not started");
			}
			
			JOptionPane.showMessageDialog(frame, "Word is present " + wordcount + " times in given file");
		}
	}
}

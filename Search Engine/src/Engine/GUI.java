/* 
 * GUI class
 * Creation of the GUI: buttons, text fields and message window.
 * From here we call other two classes for selection of the file and
 * the search engine itself
 */

package Engine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame implements ActionListener {
	
	// Creating the window with JFrame
	JFrame frame = new JFrame("Search Engine"); // window itself
	JButton button1 = new JButton("Search"); // search button
	JButton button2 = new JButton("Select files"); // select file button
	JTextField text1 = new JTextField("enter the phrase"); // text field fro searched word
	String inputFile; // variable for the word that user entered
	
	
	public GUI() { // method initialising GUI
		
		Frame();
		TextToSearch();
		SelectFilesButton();
		SearchButton();		
	}
	
	public void Frame() // method for frame creation
	{
		frame.setSize(500,500);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void TextToSearch() // method for text field creation
	{
	    frame.add(text1);
	    text1.setVisible(true);
	    text1.setBounds(20,100,250,20);
	    text1.addActionListener(this);
	}
	
	// next two methods create both search and select buttons
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
	
	
	// Action Listener method 	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand(); 
		String input;
		int wordcount = 0;
		
		// statement for the select files button being pressed
		if (command.equals("SelectFiles"))
		{
			this.inputFile = SelectFiles.FileChooser(); // calling FileChooser method from SelectFiles class
			
			System.out.println(this.inputFile); // checker if it was succesful, displays path of the file
		}
		
		// statement for the search button being pressed
		if (command.equals("SearchText"))
		{
			input = text1.getText(); // reading the user's input
			
			System.out.println(input); // check if its succesful
			
			// initializing searching method from FileProcessor class
			try {
				wordcount = FileProcessor.FileSearch(this.inputFile, input);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("search not started");
			}
			// display the result of searching
			JOptionPane.showMessageDialog(frame, "Word is present " + wordcount + " times in given file");
		}
	}
}

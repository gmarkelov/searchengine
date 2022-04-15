/*
 * SelectFiles Class
 * Contains FileChooser method which allows user to search and select the file
 * that he wants to search for a word
 * Inspired by next resource: https://mkyong.com/swing/java-swing-jfilechooser-example/
 */

package Engine;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class SelectFiles {
	
	public static String FileChooser() {
		
		
		String filePath = null;
		 
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setVisible(true); // set visible for user to see the interface
		jfc.setDialogTitle("file selection:");
		jfc.setMultiSelectionEnabled(false); // multiselection switched off to avoid crash
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	
		int returnValue = jfc.showOpenDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			filePath = jfc.getSelectedFile().getAbsolutePath(); // added getAbsolutePath to return the complete path of the file 
			
		}
		
		return filePath; // returning the string variable with full path in it
	}		
}

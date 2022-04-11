package Engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class SelectFiles {
	
	public static ArrayList<String> FileChooser() {
		
		ArrayList<String> selectedFiles = new ArrayList<String>();
		 
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setVisible(true);
		jfc.setDialogTitle("Multiple file and directory selection:");
		jfc.setMultiSelectionEnabled(true);
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	
		int returnValue = jfc.showOpenDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File[] files = jfc.getSelectedFiles();
			
			Arrays.asList(files).forEach(x -> {
				if (x.isFile()) {	
					selectedFiles.add(x.getName());
				}
			});
		}
		
		return selectedFiles;
	}		
}

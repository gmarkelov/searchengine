package Engine;





import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class SelectFiles {
	
	public static String FileChooser() {
		
		
		String filePath = null;
		 
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setVisible(true);
		jfc.setDialogTitle("Multiple file and directory selection:");
		jfc.setMultiSelectionEnabled(true);
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	
		int returnValue = jfc.showOpenDialog(null);
		
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			filePath = jfc.getSelectedFile().getAbsolutePath();
			
		}
		
		return filePath;
	}		
}

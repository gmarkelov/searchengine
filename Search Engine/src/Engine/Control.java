package Engine;

import java.util.ArrayList;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> inputFiles = new ArrayList<String>();
		
		GUI gui = new GUI();
		
		inputFiles = SelectFiles.FileChooser();
	}

}

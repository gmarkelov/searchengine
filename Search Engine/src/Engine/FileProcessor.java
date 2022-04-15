package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessor {
	
	public static int FileSearch(String inputFile, String inputf) throws IOException {
		
		System.out.println("open");
		System.out.println(inputFile);
		
		//java.util.Iterator<String> itr = inputFiles.iterator();
		
		File f1 = new File(inputFile); //Creation of File Descriptor for input file
	    String[] words = null;  // intialize the word Array
	    FileReader fr = new FileReader(f1);  //Creation of File Reader object
	    BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	    String s;     
	    int count = 0;   // intialize the word to zero
	    
	    System.out.println("loop open");
	    
	    while((s=br.readLine())!=null)   //Reading Content from the file
	    {
	       words=s.split(" ");  //Split the word using space
	       for (String word : words) 
	       {
	             if (word.equals(inputf))   //Search for the given word
	             {
	                count++;    //If Present increase the count by one
	             }
	       }
	    }
	    
	    fr.close();
		
	    return count;
	}
	
}

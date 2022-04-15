/*
 * FileProcessor Class
 * Contains the search engine which:
 * recieves path of the file and word to search
 * opens file
 * reads file line by line splitting each word by word
 * compares the searched word with each word in line and counts when they are same
 */


package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessor {
	
	public static int FileSearch(String inputFile, String inputf) throws IOException {
		
		System.out.println("open"); // call checker
		System.out.println(inputFile); // checker
		
		File f1 = new File(inputFile); // creation of File Descriptor for input file
	    String[] words = null;  // intialize the word Array
	    FileReader fr = new FileReader(f1);  // creation of File Reader object
	    BufferedReader br = new BufferedReader(fr); // creation of BufferedReader object
	    String s;     
	    int count = 0;   
	    
	    while((s=br.readLine())!=null)   // reading Content from the file
	    {
	       words=s.split(" ");  // split the word using space
	       for (String word : words) 
	       {
	             if (word.equals(inputf))   // search for the given word
	             {
	                count++;    // if Present increase the count by one
	             }
	       }
	    }
	    
	    fr.close(); // close the file
		
	    return count; // return number of appeareances of the word
	}
	
}

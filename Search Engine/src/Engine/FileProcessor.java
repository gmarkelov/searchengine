package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileProcessor {
	
	public void FileSearch(String file_name, String input) {
		
		int count = 0;
		String s;
		String[] words = null;
		File file = new File(file_name);
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Error: couldn't open the file");
		}
		BufferedReader breader = new BufferedReader(reader);
		
		try {
			while((s = breader.readLine()) != null)
			{
				words = s.split(" ");
				for (String word : words)
				{
					if (s.equals(input))
					{
						count++;
					}
				}
			}
			if (count != 0)
			{
				System.out.println(file_name + "has " + count + input);
			}
			if (count == 0)
			{
				System.out.println(file_name + "does not have " + input);
			}
			
			reader.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: search failed");
		}
	}
	
}

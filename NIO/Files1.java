import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

import java.util.List;

import java.io.*;

public class Files1 {
	
	public static void main(String[] args) throws IOException 
	{
		Path p1 =  Paths.get("G:\\New folder\\VIT CCM and  Notes\\Interim Semester Nov 2020\\GoodClass.txt");
		System.out.println(p1);
		Files.createFile(p1);
		Files.delete(p1);

		List<String> l1 = Files.readAllLines(p1);
		System.out.print(l1);

		File file1 = new File("assignment.txt");  //in workspace folder same project folder
		boolean x = file1.createNewFile();
		if(x) {
			System.out.println("Your file created.");
		} else {
			System.out.println("Already exists.");
		}
		
		FileReader content = new FileReader(file1);
		char[] arr = new char[200];
		content.read(arr);
		System.out.println(arr);
		content.close();	
	}
}

import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.io.*;

public class PathUsage {

	public static void main(String[] args) throws IOException {
		
		Path p1 = Paths.get("G:\\New folder\\VIT CCM and  Notes\\Interim Semester Nov 2020\\Java Notes 2020");
		System.out.println(p1);
		File file1 = new File("assignment.txt");  //will create in workspace project folder.
		boolean status = file1.createNewFile();
		if(status) {
			System.out.println("The new file created.");
		}
		else {
			System.out.println("File already exists.");
		}

		FileReader content = new FileReader(file1);
		char[] arr = new char[200];
		content.read(arr);
		System.out.println(arr);
		content.close();

		FileAttribute<?> file2 = null;
		//FileAttribute<?> 
		Path p2 = Paths.get("G:\\New folder\\VIT CCM and  Notes\\Interim Semester Nov 2020\\Java Notes 2020\\new.txt");
		Files.createFile(p2);
		Files.delete(p2);
	}
}

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ReadFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("temp.txt");
		try {
		    List<String> lines = Files.readAllLines(path);
		    System.out.println(lines);
		} catch (IOException e) {
		    // something failed
		    e.printStackTrace();
		}
	}
}

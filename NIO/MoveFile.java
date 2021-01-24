import java.io.IOException;
import java.nio.file.*;

public class MoveFile {

	public static void main(String[] args) throws IOException {
		Path sourcepath = Paths.get("C:\\data\\temp\\temp.txt");
		Path destinationepath = Paths.get("C:\\data\\temp\\mydir\\temp.txtr");

       	Files.move(sourcepath, destinationepath, StandardCopyOption.REPLACE_EXISTING);
	}
}

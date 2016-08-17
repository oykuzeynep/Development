package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOperations {

	public static void createDirectory(String dir) throws IOException {
		Files.createDirectories(Paths.get(dir));
		System.out.println(dir + " oluşturuldu.");
	}
}

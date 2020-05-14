package DAY5;

import java.io.File;
import java.text.SimpleDateFormat;

public class File11 {
	public static void main(String[] args) {
		// Specify the file path and name
		File file = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}
}


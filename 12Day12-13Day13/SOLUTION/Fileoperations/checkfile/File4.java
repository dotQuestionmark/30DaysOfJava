package DAY5;

import java.io.File;
import java.io.IOException;

public class File4 {
	public static void main(String[] args) {
		// Provide the complete file path here
		File file = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");

		if (file.isHidden()) {
			System.out.println("The specified file is hidden");
		} else {
			System.out.println("The specified file is not hidden");
		}
	}
}


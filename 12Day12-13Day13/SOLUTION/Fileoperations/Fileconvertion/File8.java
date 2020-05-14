package DAY5;

import java.io.File;
import java.io.IOException;

public class File8 {
	public static void main(String[] args) {
		File myfile = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
		if (myfile.canWrite()) {
			System.out.println("File is writable.");
		} else {
			System.out.println("File is read only.");
		}
	}
}


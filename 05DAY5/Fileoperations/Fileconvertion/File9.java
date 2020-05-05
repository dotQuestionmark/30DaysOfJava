package DAY5;

import java.io.File;
import java.io.IOException;

public class File9 {
	public static void main(String[] args) {

		File myfile = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
		// changing the file mode to writable
		myfile.setWritable(true);
		if (myfile.canWrite()) {
			System.out.println("File is again writable.");
		} else {
			System.out.println("File is still read only.");
		}
	}
}


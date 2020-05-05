package DAY5;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		try {
			File file = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
			/*
			 * If file gets created then the createNewFile() method would return true or if
			 * the file is already present it would return false
			 */
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}

	}
}


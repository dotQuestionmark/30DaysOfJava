package DAY5;

import java.io.File;

public class File12 {
	public static void main(String[] args) {
		// Old File
		File oldfile = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
		// New File
		File newfile = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\renamedfile.txt");
		/*
		 * renameTo() return boolean value It return true if rename operation is
		 * successful
		 */
		boolean flag = oldfile.renameTo(newfile);
		if (flag) {
			System.out.println("File renamed successfully");
		} else {
			System.out.println("Rename operation failed");
		}
	}
}


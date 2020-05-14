package DAY5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter what do you want to write in the file");
		String mycontent = in.nextLine();
		try {
			// Specify the file path here
			file = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");
			fos = new FileOutputStream(file);

			/*
			 * This logic will check whether the file exists or not. If the file is not
			 * found at the specified location it would create a new file
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			/*
			 * String content cannot be directly written into a file. It needs to be
			 * converted into bytes
			 */
			byte[] bytesArray = mycontent.getBytes();

			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}
}


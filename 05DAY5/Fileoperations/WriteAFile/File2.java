package DAY5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2 {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter what you want to write in your file");
		try {
			String mycontent = in.nextLine();
			// Specify the file name and path here
			File file = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt");

			/*
			 * This logic will make sure that the file gets created if it is not present at
			 * the specified location
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("File written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}
}


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class Files {

    public static void main(String args[]){

        System.out.print("Enter no: ");
	Scanner scan = new Scanner(System.in);
	int one = scan.newInt();
	int two = scan.newInt();         //input no from user
        FileWriter fWriter = null;
        BufferedWriter writer = null;
	try {                               //saving data to file
          fWriter = new FileWriter("newfile.txt");
          writer = new BufferedWriter(fWriter);
          writer.write(text);
          writer.newLine();
          writer.close();
          System.err.println("Your input of " + text.length() + " characters was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }

	// Specify the path of the file here
		File file = new File("D:\\JAVA\\newfile.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		try {
			// FileInputStream to read the file
			fis = new FileInputStream(file);

			/*
			 * Passed the FileInputStream to BufferedInputStream For Fast read using the
			 * buffer array.
			 */
			bis = new BufferedInputStream(fis);

			/*
			 * available() method of BufferedInputStream returns 0 when there are no more
			 * bytes present in the file to be read
			 */
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}
			} catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found" + fnfe);
		} catch (IOException ioe) {
			System.out.println("I/O Exception: " + ioe);
		} finally {
			try {
				if (bis != null && fis != null) {
					fis.close();
					bis.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in InputStream close(): " + ioe);
			}
		}

		//Converting file to raed only mode 
		BufferedReader br = null;
		BufferedReader br2 = null;
		try {
			br = new BufferedReader(new FileReader("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY5\\newfile.txt"));

			// One way of reading the file
			System.out.println("Reading the file using readLine() method:");
			String contentLine = br.readLine();
			while (contentLine != null) {
				System.out.println(contentLine);
				contentLine = br.readLine();
			}
			br2 = new BufferedReader(new FileReader("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY6\\newfile.txt"));

			// Second way of reading the file
			System.out.println("Reading the file using read() method(2):");
			int num = 0;
			char ch;
			while ((num = br2.read()) != -1) {
				ch = (char) num;
				System.out.print(ch);
			}
			} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (br2 != null)
					br2.close();
			} catch (IOException ioe) {
				System.out.println("Error in closing the BufferedReader");
			}
		}
	}
}

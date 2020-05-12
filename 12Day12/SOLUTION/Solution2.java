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
	try {
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

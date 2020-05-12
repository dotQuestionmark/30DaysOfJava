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

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

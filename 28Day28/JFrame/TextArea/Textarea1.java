package walkthrough;

import javax.swing.*;

public class Textarea1 {

	Textarea1() {// creating counstrucctor
		JFrame f = new JFrame("note pad");// adding frame instance 
		JTextArea area = new JTextArea();// creating the instance for text area
		area.setBounds(10, 30, 200, 200);// position and dimension of text area
		f.add(area);// adding text area in the frame
		f.setSize(300, 300);// setting the frame size 
		f.setLayout(null);// set layout instance to null
		f.setVisible(true);// setting the instance to visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Textarea1 ob = new Textarea1();// called the class instructor through object initiation
	}
}


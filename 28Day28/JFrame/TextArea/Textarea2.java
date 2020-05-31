package walkthrough;

import javax.swing.*;
import java.awt.event.*;

public class Textarea2 implements ActionListener {
	JLabel l1, l2;
	JTextArea area;
	JButton b;
	private ActionEvent e;

	Textarea2() {
		JFrame f = new JFrame("Character counter");// this instance for frame
		l1 = new JLabel();// same
		l1.setBounds(50, 25, 100, 30);// same
		l2 = new JLabel();// same 
		l2.setBounds(160, 25, 100, 30);// same 
		area = new JTextArea();// instance for text  area
		area.setBounds(20, 75, 250, 200);// setting the position and the size
		b = new JButton("Count Words");// createing button instance
		b.setBounds(100, 300, 120, 30);// definig the axis and dimension for the wordas
		b.addActionListener(this);// using the extended class action listner
		f.add(l1);// adding the label in the frame
		f.add(l2);// adding the label in the frame
		f.add(area);// adding the textarea int the frame
		f.add(b);// addint the button
		f.setSize(450, 450);// setting the size of frame size
		f.setLayout(null);// seting layout instcance to null
		f.setVisible(true);// setting the instance to visible
		actionPerformed(e);// calling the method action performed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String text = area.getText();// get the text in the given text area
		String words[] = text.split("\\s");// spliting texts thropugh space tou count number of wordz
		l1.setText("Words: " + words.length);// printing out the number of words
		l2.setText("Characters: " + text.length());// printing out the number of characters
	}

	public static void main(String[] args) {
		Textarea2 ob = new Textarea2();// class counstructor calling through objects
	}
}


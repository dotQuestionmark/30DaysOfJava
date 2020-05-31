package walkthrough;

import javax.swing.*;

public class Button {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");// creating instance of JFrame

		JButton b = new JButton("Button");// creating instance of JButton
		b.setBounds(200, 200, 100, 100);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		f.setSize(500, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


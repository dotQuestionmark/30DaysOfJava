package walkthrough;

import javax.swing.*;

public class Textfiled1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("TextField Example");
		JTextField t1, t2;
		t1 = new JTextField();
		t1.setBounds(50, 100, 200, 30);
		t2 = new JTextField();
		t2.setBounds(50, 150, 200, 30);
		f.add(t1);
		f.add(t2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//here if you see first we created an instance for the frame that we will be using and then created and instance for two text fields and gave them there position and size and then added them in the frame
// then we decided the size for the frame and then set the layout instance to null and visible instance to true

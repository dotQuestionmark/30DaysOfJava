package walkthrough;

import javax.swing.*;

public class Label {
	public static void main(String[] args) {
		JFrame f = new JFrame("Label Example");// adding instance to the frame
		JLabel l1, l2;// defineing labels 
		l1 = new JLabel("First Label.");// adding instance to the labels
		l1.setBounds(50, 50, 100, 30);// x-axis,y-axis,width,length(label 1)
		l2 = new JLabel("Second Label.");// adding instance to label 2
		l2.setBounds(50, 100, 100, 20);// x-axis,y-axis,width,length(label 2)
		f.add(l1);// adding label in the frame
		f.add(l2);// adding label int frame
		f.setSize(300, 300);// setting the size of the frame
		f.setLayout(null);// null instance declaration
		f.setVisible(true);// setting instance to visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


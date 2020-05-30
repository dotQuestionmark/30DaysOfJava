package walkthrough;

import javax.swing.*;

public class Buttonphoto {
	public static void main(String[] args) {
		Buttonqw();// called button method
	}

	static void Buttonqw() {
		JFrame f = new JFrame("Button Example");// creates frame instance
		JButton b = new JButton(new ImageIcon("C:\\Users\\hp\\Pictures\\Saved Pictures\\ss.jpg"));// path to the pic
		b.setBounds(100, 100, 500, 500);// x-axis,y-axis,width,length
		f.add(b);// add button in frame
		f.setSize(300, 400);// setsize for the frame
		f.setLayout(null);// set layout instance
		f.setVisible(true);// visible instance for frame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exits automatically
	}
}


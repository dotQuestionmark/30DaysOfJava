

package walkthrough;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Label2 extends Frame implements ActionListener {
	JTextField tf;// added text field
	JLabel l;// added label
	JButton b;// added button
	private ActionEvent e;// created an event e

	Label2() {// counstructor for class
		JFrame f = new JFrame("IP Finder"):
		tf = new JTextField();// new text field instance created
		tf.setBounds(50, 50, 150, 20);// postition nad dimension creatred
		l = new JLabel();// same another label
		l.setBounds(50, 100, 250, 20);// with its axis and dimension
		b = new JButton("Find IP");// button instance created
		b.setBounds(50, 150, 95, 30);// with its axis and dimension
		b.addActionListener(this);// actionlistner class that extended used with the help of this key word
		f.add(b);// added button in the frame
		f.add(tf);// added the textfield in the frame
		f.add(l);// added a label in the frame
		f.setSize(400, 400);// defining the size of frame
		f.setLayout(null);// setting layout instance
		f.setVisible(true);// setting instance to visible
		actionPerformed(e);// called the method action performed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		Label2 obj = new Label2();// created and object for label2 class
	}
}


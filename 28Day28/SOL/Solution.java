// Java program to create a simple calculator 
// with basic +, -, /, * using java swing elements 
  
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;
class calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField l;

    // store oprerator and operands
    String s0, s1, s2;

    // default constrcutor
    calculator()
    {
        s0 = s1 = s2 = "";
    }
// main function 
    public static void main(String args[]) 
    { 
        // create a frame 
        f = new JFrame("calculator"); 
	try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
	 // create a object of class
        calculator c = new calculator();

        // create a textfield
        l = new JTextField(16);

        // set the textfield to non editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

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


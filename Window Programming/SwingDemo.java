import java.awt.*;
import javax.swing.*;

class SwingDemo {
    JLabel lbl1, lbl2, lbl3;
    JTextField txt1, txt2, txt3;
    JButton btn;
    SwingDemo(){
        JFrame j = new JFrame("Simple Calculator");
        lbl1 = new JLabel("Enter 1 :- ");
        lbl2 = new JLabel("Enter 2 :- ");
        lbl3 = new JLabel("Result :- ");
        
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        txt3.setEditable(false);

        btn = new JButton("Add");

        j.setLayout(new FlowLayout());
        j.add(lbl1);
        j.add(txt1);

        j.add(lbl2);
        j.add(txt2);
        
        j.add(lbl3);
        j.add(txt3);

        j.add(btn);

        j.setSize(300, 300);
        j.setVisible(true);
        // j.show();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingDemo();
    }
}

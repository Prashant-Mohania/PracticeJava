import java.awt.Color;
import javax.swing.*;

class TArea {

    JFrame f;
    JTextArea a;

    TArea() {
        f = new JFrame("Text Area");
        a = new JTextArea(300, 300);
        a.setBounds(10, 30, 300, 300);
        a.setBackground(Color.white);
        a.setForeground(Color.red);
        f.add(a);
        f.setSize(400, 400);
        f.setLayout(null);
        a.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.show();
    }

    public static void main(String[] args) {
        new TArea();
    }
}
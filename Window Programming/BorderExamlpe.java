import java.awt.*;
import javax.swing.*;

public class BorderExamlpe {
    JFrame f;
    JButton e, w, n, s, c;

    BorderExamlpe() {
        f = new JFrame("Border Layout");
        BorderLayout bl = new BorderLayout();
        f.setLayout(bl);

        e = new JButton("E");
        w = new JButton("W");
        n = new JButton("N");
        s = new JButton("S");
        c = new JButton("C");
    }

    public void launchFrame() {
        f.add(e, BorderLayout.EAST);
        f.add(w, BorderLayout.WEST);
        f.add(n, BorderLayout.NORTH);
        f.add(s, BorderLayout.SOUTH);
        f.add(c, BorderLayout.CENTER);

        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BorderExamlpe be = new BorderExamlpe();
        be.launchFrame();
    }
}

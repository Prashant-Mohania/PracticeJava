import java.awt.*;

class ThirdFrame {
    public static void main(String[] args) {
        Frame f = new Frame("Third Frame");
        Label l = new Label("Customer Name");
        TextField t = new TextField("Prashant Mohania", 20);
        Button b = new Button("Submit");
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);
        f.add(l);
        f.add(t);
        f.add(b);
        f.setBackground(Color.GRAY);
        f.setForeground(Color.BLACK);
        f.setSize(900, 500);
        f.setVisible(true);
        System.out.println("ctrl+c");
    }
}

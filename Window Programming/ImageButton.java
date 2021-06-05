import javax.swing.*;

class ImageButton {
    ImageButton(){
        JFrame j = new JFrame("Button Demo");
        ImageIcon img = new ImageIcon("E:\\PRAMO_CD\\Practice Flutter\\mockpedia\\assets\\logo.jpg");
        JButton btn = new JButton(img);
        btn.setBounds(130, 100, 850, 350);
        j.add(btn);
        j.setSize(900, 500);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ImageButton();
    }
}

import java.awt.*;

class MyFrame extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    MyFrame(){
        super("My Frame");
        setBackground(Color.CYAN);
        setSize(300, 300);
        setCursor(Frame.HAND_CURSOR);
        show();
    }
    public static void main(String[] args) {
        new MyFrame();
        System.out.println("ctrl+c");
    }
}

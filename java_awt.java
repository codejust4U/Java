import java.awt.*;

public class java_awt extends Frame {

    public void awt_function() {
        Label lb = new Label("Working with AWT");
        lb.setBounds(100, 50, 100, 100);
        lb.setBackground(new Color(255,230,0));
        add(lb);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        java_awt ob = new java_awt();
        ob.awt_function();
    }
}

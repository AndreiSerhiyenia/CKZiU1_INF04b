import javax.swing.*;

import static javax.swing.BoxLayout.Y_AXIS;

public class DesktopAplication2 extends JFrame {


    @Override
    public void setBounds(int x, int y, int width, int height) {
        int w = width*2;

        super.setBounds(x, y, width, height);
    }

    public static void main(String[] args) {
        DesktopAplication2 jFrame = new DesktopAplication2();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Calculator");
        jFrame.setBounds(10, 20, 200, 300);
        jFrame.setVisible(true);
        BoxLayout layout = new BoxLayout(jFrame.getContentPane(), Y_AXIS);



    }
}



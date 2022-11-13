import com.sun.tools.javac.Main;
import javax.swing.*;
public class DesktopAplication {
    public static void main(String[] args) {
        DesktopAplication m = new DesktopAplication();
      JFrame jFrame = new JFrame();
        jFrame.add(new JLabel("teleson"));
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Calculator");
        jFrame.setBounds(10, 20, 200, 300);
        JTextField phone = new JTextField(20);
        jFrame.setVisible(true);


        // wyjątki? try cath !!!!


    }
}


package gui.sec01;

import javax.swing.*;
import java.awt.*;

public class StarDemo extends javax.swing.JFrame {
    StarDemo() {
        setTitle("타원, 호, 다각형 그리기");

        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.red);

                int x[] = {82, 92, 112, 92, 100, 80, 55, 68, 49, 72, 82};
                int y[] = {8, 32, 38, 50, 75, 55, 72, 45, 28, 30, 8};

                g.fillPolygon(x, y, x.length);

                g.fillArc(150, 10, 50, 50, 90, 90);

                g.setColor(Color.black);
                g.fillArc(150, 10, 50, 50, 0, 90);

                g.setColor(Color.green);
                g.fillArc(150, 10, 50, 50, 180, 90);

                g.setColor(Color.yellow);
                g.fillArc(150, 10, 50, 50, 270, 90);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StarDemo();
    }
}

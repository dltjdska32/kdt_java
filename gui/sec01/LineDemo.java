package gui.sec01;

import javax.swing.*;
import java.awt.*;

public class LineDemo extends javax.swing.JFrame {
    int[] x = {155, 205, 255};
    int[] y = {5, 50, 5};

    LineDemo() {
        setTitle("직선 그리기");

        class MyPanel extends JPanel {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.red);
                g.drawLine(50,10,150,50);
                g.setColor(Color.green);
                g.drawPolyline(x, y, 3);

                g.setColor(Color.RED);
                g.drawRect(30, 110, 50, 50);
                g.drawRoundRect(120, 110, 50, 50, 30, 30);
                g.draw3DRect(210, 10, 50, 50, false);
                g.draw3DRect(300, 10, 50, 50, true);

                g.setColor(Color.green);
                g.fillRect(30, 80, 50, 50);
                g.fillRoundRect(120, 80, 50, 50, 30, 30);
                g.fill3DRect(210, 80, 50, 50, false);
                g.fill3DRect(300, 80, 50, 50, true);
            }
        }

        add(new MyPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LineDemo();
    }
}

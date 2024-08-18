package gui.sec01;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClipDemo extends javax.swing.JFrame {
    ClipDemo() {
        setTitle("Clip Demo");

        class MyPanel extends JPanel {
            BufferedImage balloons, bear;

            public MyPanel() {
                try {
                    this.balloons = ImageIO.read(new File("C:/Users/dltjd/kdt_java/gui/sec01/balloons.png"));
                    this.bear = ImageIO.read(new File("C:/Users/dltjd/kdt_java/gui/sec01/bear.png"));
                } catch (IOException e) {

                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                //클립을 한 영역만 화면에 표출
                g.setClip(30,20,240,170);
                g.drawImage(balloons, 0, 0, null);
                g.setColor(Color.RED);
                g.drawRect(20,10,100,100);
                g.drawImage(bear,190, 120,null);
            }

        }

        add(new MyPanel());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClipDemo();
    }
}

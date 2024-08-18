package gui.sec01;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDemo extends javax.swing.JFrame {

    ImageDemo() {
        setTitle("Image Demo");

        class MyPanel extends JPanel {
            BufferedImage img;

            public MyPanel() {
                try {
                    img = ImageIO.read(new File("C:/Users/dltjd/kdt_java/gui/sec01/tiger.png"));

                }catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(img, 0, 0, null);
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageDemo();
    }
}

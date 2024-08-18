package gui.sec01;

import javax.swing.*;
import java.awt.*;

public class FontDemo2 extends javax.swing.JFrame {
    FontDemo2() {
        setTitle("Font Demo");
        add(new MyPanel());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 230);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Font f1 = new Font("TimesRoman", Font.BOLD, 20);
            Font f2 = new Font("TimesRoman", Font.PLAIN, 10);
            Font f3 = new Font("TimesRoman", Font.ITALIC, 30);
            Font f4 = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 16);
            Font f5 = new Font("Helvetica", Font.BOLD, 20);
            Font f6 = new Font("Courier", Font.BOLD, 10);
            Font f7 = new Font("Dialog", Font.ITALIC, 30);


            g.setFont(f1);
            g.drawString("안녕하세요 (TimesRoman Plain)", 10, 25);
            g.setFont(f2);
            g.drawString("안녕하세요 (TimesRoman Bold)", 10, 50);
            g.setFont(f3);
            g.drawString("안녕하세요 (TimesRoman Italic)", 10, 75);
            g.setFont(f4);
            g.drawString("안녕하세요 (TimesRoman Bold & Italic)", 10, 100);
            g.setFont(f5);
            g.drawString("안녕하세요 (Helvetica)", 10, 125);
            g.setFont(f6);
            g.drawString("안녕하세요 (Courier)", 10, 150);
            g.setFont(f7);
            g.drawString("안녕하세요 (Dialog)", 10, 175);

        }
    }

    public static void main(String[] args) {
        new FontDemo2();
    }
}

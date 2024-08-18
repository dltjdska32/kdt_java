package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringDemo extends javax.swing.JFrame {
    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Color strColor = new Color(Color.red.getRGB());

            g.setColor(strColor);
            g.drawString("문자열 그리기", 20, 20);
            g.drawString(" ㅇㅋ ㅇㅋ", 50, 50);
        }
    }

        StringDemo() {

            setTitle("문자열 그리기");

//
//            add(new MyPanel());
            colorMethod();


            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 300);
            setVisible(true);
        }

        void colorMethod() {
            JButton b = new JButton("색상 변환");
            add(b);
            b.addActionListener(e -> {
                Color color = new Color((int) (Math.random() * 255)
                        ,(int) (Math.random() * 255)
                        , (int) (Math.random() * 255));
                b.setBackground(color);
                    }
            );
        }


        public static void main(String[] args) {
            new StringDemo();
        }
}


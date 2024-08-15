package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class HelloEventDemo extends JFrame {
    public HelloEventDemo() {
        setTitle("안녕?" +
                "고구마");
        JPanel panel = new JPanel(new FlowLayout());
        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼, 클릭");

            }
        };

        JButton b = new JButton("클릭");
        b.addActionListener(l); // 액션리스너 구현 객체를 연결

        JButton b1 = new JButton("클릭");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("b1 btn 클릭");

            }
        });


        panel.add(b);
        panel.add(b1);

        add(panel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloEventDemo();
    }
}


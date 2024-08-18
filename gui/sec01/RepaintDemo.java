package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepaintDemo extends javax.swing.JFrame {

    List<Rectangle> list = new ArrayList<Rectangle>();
    MouseEvent e;
    Random r = new Random();

    public static void main(String[] args) {
        new RepaintDemo();
    }

    RepaintDemo() {
        setTitle("클릭시 임의의 사각형 생성");


        add(new MousePanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    class MousePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            addMouseListener(new MouseAdapter() {
               public void mousePressed(MouseEvent e) {
                   if(RepaintDemo.this.e != null) {
                       if(RepaintDemo.this.e.equals(e))
                           return;
                   }

                   int w = r.nextInt(20) + 5;
                   int x = r.nextInt(350);
                   int y = r.nextInt(150);
                   list.add(new Rectangle(x, y, w, w));
                   repaint();

                   RepaintDemo.this.e = e;
               }
            });

            for (int i = 0; i < list.size(); i++) {
                Rectangle r = list.get(i);
                int x = (int) r.getX();
                int y = (int) r.getY();
                int l = (int) r.getWidth();
                g.drawRect(x, y, l, l);
            }

        }
    }
}

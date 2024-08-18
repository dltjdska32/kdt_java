package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDragTest extends javax.swing.JFrame {
    private int x1, y1, x2, y2;
    private JLabel status;
    Color color = Color.black;

    MouseDragTest() {
        setTitle("Mouse Drag Test");
        JPanel p1 = new JPanel() {
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(color);
                int x = (x1 < x2) ? x1 : x2;
                int y = (y1 < y2) ? y1 : y2;
                int width = Math.abs(x1 - x2);
                int height = Math.abs(y1 - y2);
                g.drawRect(x, y, width, height);
            }
        };

        p1.setBackground(Color.YELLOW);
        MyMouseListener mouseListener = new MyMouseListener();
        p1.addMouseListener(mouseListener);
        p1.addMouseMotionListener(mouseListener);

        JPanel p2 = new JPanel();
        status = new JLabel("마우스 위치 정보");
        p2.add(status);

        add("Center", p1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);


    }

    private class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            status.setText("x1: " + x1 + " y1: " + y1);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("x1: " + x1 + " y1: " + y1 + "    x2: " + x2 + " y2: " + y2);
            repaint();
        }


        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("x1: " + x1 + " y1: " + y1 + "    x2: " + x2 + " y2: " + y2);
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }



        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new MouseDragTest();
    }
}

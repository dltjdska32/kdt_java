package gui.sec01;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAdapterDemo extends JFrame {
    KeyAdapterDemo() {
        setTitle("키 어댑터");

        JLabel l = new JLabel("", JLabel.CENTER);
        JTextField tf = new JTextField(10);
        add("North", tf);
        add("Center", l);

//        KeyListener listener = new KeyListener() {
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//                    l.setText("입력 문자열 : " + tf.getText());
//                }
//            }
//            public void keyPressed(KeyEvent e) {}
//            public void keyReleased(KeyEvent e) {}
//        };

        // keyAdapter는 keyListener 인터페이스를 상속받은 추상클래스로 어탭터 클래스를 사용하면 keyListener인터페이스 함수를 모두 오버라이드 할 필요 없음.
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    l.setText("입력한 문자열 : " + tf.getText());
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}

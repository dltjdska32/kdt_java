package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuDemo extends javax.swing.JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem mi = (JMenuItem) e.getSource();

        switch (mi.getText()) {
            case "새 파일":
                System.out.println("새 파일");
                break;
            case "파일 열기":
                System.out.println("파일 열기");
                break;
            case "파일 저장":
                System.out.println("파일 저장");
                break;
            case "파란색":
                this.getContentPane().setBackground(Color.BLUE);
                break;
            case "빨간색":
                this.getContentPane().setBackground(Color.RED);
                break;
        }
    }

    MenuDemo() {
        setTitle("Menu Demo");

        makeMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 170);
        setVisible(true);
    }

    private void makeMenu() {
        JMenuItem item;
        KeyStroke key;

        // 메뉴바
        JMenuBar mb = new JMenuBar();

        // 메뉴
        JMenu menu = new JMenu("파일");
        JMenu mColor = new JMenu("색상");

        // 메뉴 아이템
        item = new JMenuItem("새 파일", KeyEvent.VK_N);
        menu.add(item);
        item.addActionListener(this);

        item = new JMenuItem("파일 열기", KeyEvent.VK_O);
        menu.add(item);
        item.addActionListener(this);
        
        //파일열기와 파일저장을 구분짓는 선
        menu.addSeparator();

        item = new JMenuItem("파일 저장");
        menu.add(item);
        item.addActionListener(this);

        item = new JMenuItem("파란색");
        mColor.add(item);
        item.addActionListener(this);

        item = new JMenuItem("빨간색");
        mColor.add(item);
        item.addActionListener(this);

        // 메뉴바에 메뉴 추가
        mb.add(menu);
        mb.add(mColor);


        // 메뉴바 프레임 추가
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}

package gui.sec01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CalculatorDemo extends javax.swing.JFrame {
    String val_1;
    String val_2;
    String opCode;
    int result;

    JTextField tfResult;
    //JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton[] buttons = new JButton[10];
    JButton bAdd, bSub, bMul, bDiv, bResult;

    public CalculatorDemo() {
        setTitle("Calculator");
        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

    private void showCenter() {
        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            panel.add(buttons[i]);
        }

        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bResult = new JButton("=");

        panel.add(bAdd);
        panel.add(bSub);
        panel.add(bMul);
        panel.add(bDiv);
        panel.add(bResult);

        add(panel, BorderLayout.CENTER);


        ActionListener listener = e -> {
            //텍스트 필드 값을 문자열로 가져옴
            String strText = tfResult.getText();


            if(e.getSource() == buttons[0]) {
                tfResult.setText(strText  + "0");
            } else if(e.getSource() == buttons[1]) {
                tfResult.setText(strText + "1");
            } else if(e.getSource() == buttons[2]) {
                tfResult.setText(strText + "2");
            } else if(e.getSource() == buttons[3]) {
                tfResult.setText(strText + "3");
            } else if(e.getSource() == buttons[4]) {
                tfResult.setText(strText + "4");
            } else if(e.getSource() == buttons[5]) {
                tfResult.setText(strText + "5");
            } else if(e.getSource() == buttons[6]) {
                tfResult.setText(strText + "6");
            } else if(e.getSource() == buttons[7]) {
                tfResult.setText(strText + "7");
            } else if(e.getSource() == buttons[8]) {
                tfResult.setText(strText + "8");
            } else if(e.getSource() == buttons[9]) {
                tfResult.setText(strText + "9");
            } else if(e.getSource() == bAdd) {
                val_1 = tfResult.getText();
                tfResult.setText("");
                opCode = "+";
            } else if(e.getSource() == bSub) {
                val_1 = tfResult.getText();
                tfResult.setText("");
                opCode = "-";
            } else if(e.getSource() == bMul) {
                val_1 = tfResult.getText();
                tfResult.setText("");
                opCode = "*";
            } else if(e.getSource() == bDiv) {
                val_1 = tfResult.getText();
                tfResult.setText("");
                opCode = "/";
            } else if(e.getSource() == bResult) {
                val_2 = tfResult.getText();
                runCal();
            }

        };

        for (JButton button : buttons) {
            button.addActionListener(listener);
        }
        bAdd.addActionListener(listener);
        bSub.addActionListener(listener);
        bMul.addActionListener(listener);
        bDiv.addActionListener(listener);
        bResult.addActionListener(listener);
    }

    private void runCal() {
        switch(opCode) {
            case "+" :
                        result = Integer.parseInt(val_1) + Integer.parseInt(val_2);
                        tfResult.setText(String.valueOf(result));
                        val_1 = "";
                        val_2 = "";
                        break;
            case "-" :
                        result = Integer.parseInt(val_1) - Integer.parseInt(val_2);
                        tfResult.setText(String.valueOf(result));
                        val_1 = "";
                        val_2 = "";
                        break;
            case "*" :
                        result = Integer.parseInt(val_1) * Integer.parseInt(val_2);
                        tfResult.setText(String.valueOf(result));
                        val_1 = "";
                        val_2 = "";
                        break;
            case "/" : if(val_2.equals("0"))
                        result = Integer.parseInt(val_1) / Integer.parseInt(val_2);
                        tfResult.setText(String.valueOf(result));
                        val_1 = "";
                        val_2 = "";
                        break;
        }
    }

    private void showNorth() {
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        tfResult = new JTextField(10);

        panel.add(tfResult);
        panel1.add(panel);

        add(tfResult, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new CalculatorDemo();
    }
}

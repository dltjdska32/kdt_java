package gui.sec01;

import java.awt.*;

public class FontDemo {
    
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // 폰트 이름들을 배열로 
        String[] fontNames = ge.getAvailableFontFamilyNames();

        // 폰트 이름 출력
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}

package chap_06;

public class JetShipDemo {
    public static void main(String[] args) {
        Ship ship = new Ship(); //부모
        JetShip jet = new JetShip(); //자식

      //  jet = ship; 부모 -> 자식 불가

        ship = jet;

        jet = (JetShip) ship; //강제형변환


    }
}

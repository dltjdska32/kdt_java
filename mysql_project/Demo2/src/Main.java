import dao.UserDAO;
import dao.impl.UserDaoImpl;
import dto.UsersDTO;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Connection conn = DBManager.getInstance().open();

        if (conn == null) {
            System.out.println("데이터베이스 접속 실패");
          
            return;

        }
        System.out.println("여기 여기");
        // 2) 조회할 데이터
        String target = "winter";

        // 3) 데이터 수정
        UserDAO dao = new UserDaoImpl(conn);
        UsersDTO result = dao.selectOne(target);

        // 4) 결과 판별
        if (result == null) {
            System.out.println("조회결과 없음");
        } else {
            System.out.println(result.toString());
        }

        // 5) DB 접속 해제
        DBManager.getInstance().close();

    }

}
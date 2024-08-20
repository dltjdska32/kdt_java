import java.sql.*;

public class ConnectionDemo {
    public static Connection makeConnection() {
        String url = "jdbc:mysql://localhost/javadb?serverTimezone=Asia/Seoul";

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("데이터베이스 연결중 ...");
            con = DriverManager.getConnection(url, "juser", "159159");
            System.out.println("데이터베이스 연결 성공");

            String sql = "insert into users values(?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "january"); //아이디
            ps.setString(2, "일월이"); //이름
            ps.setString(3, "xyz"); //패스워드
            ps.setInt(4, 49); //나이
            ps.setString(5, "123@naver.com"); //이메일

            int rows = ps.executeUpdate();
            System.out.println("저장된 행 수 " + rows);


        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        makeConnection();

    }
}

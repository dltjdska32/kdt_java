import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static DBManager currnet = null;

    public static DBManager getInstance(){
        if(currnet == null){
            currnet = new DBManager();
        }
        return currnet;
    }

    public static void freeInstance() {
        currnet = null;
    }

    private DBManager(){
        super();
    }

    private static final String db_hostname = "localhost";
    private static final String db_port = "3306";
    private static final  String db_database = "javadb";
    private static final String db_charset = "utf8";
    private static final String db_user = "juser";
    private static final String db_password = "159159";

    private Connection conn = null;

    public Connection open() {
        if(conn == null){
            String urlFormat = "jdbc:mysql://%s:%s/%s?characterEncoding=%s&serverTimezone=Asia/Seoul";
            String url = String.format(urlFormat, db_hostname, db_port, db_database, db_charset);
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(url, db_user, db_password);
                System.out.println("=== DATABASE Connect Success ===");
            } catch (ClassNotFoundException e) {
                // 실패시 메시지와 에러 내용 출력
                System.out.println("==== DATABASE Connect Fail ===");
                System.out.println(e.getMessage());
            }
            catch (SQLException e) {
                System.out.println("=== DATABASE Connect Fail ===");
                System.out.println(e.getMessage());
            }

        }
        return conn;
    }

    public void close() {
        if(conn != null){
            try{
                conn.close();
                System.out.println("=== DATABASE Connect Success ===");
            } catch (Exception e){
                System.out.println("=== DATABASE Disconnect Fail ===");
                System.out.println(e.getMessage());

            }

            conn = null;
        }

    }
}

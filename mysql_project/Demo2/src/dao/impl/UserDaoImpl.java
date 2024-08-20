package dao.impl;

import dao.UserDAO;
import dto.UsersDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDAO {

    private Connection conn;

    public UserDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int insert(UsersDTO Param) {
        int result = 0;

        // sql문 정의
        String sql = "insert into users (userid, username, userpassword, userage, useremail) "
                + "values (?, ?, ?, ?, ?)";

        //sql 실행하기위한 객체
        PreparedStatement ps = null;
        ResultSet rs = null;

        //sql 구문 처리

        try{
            //ps 객체 할당
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // 템플릿 데이터 설정
            ps.setString(1, Param.getUserId());
            ps.setString(2, Param.getUserName());
            ps.setString(3, Param.getUserPassword());
            ps.setInt(4, Param.getUserAge());
            ps.setString(5, Param.getUserEmail());

            //sql문 실행 -> 결과 행의 수를 리턴할 변수에 대입
            ps.executeUpdate();

            // pk 값 받기
            rs = ps.getGeneratedKeys();
            rs.next();
            result = rs.getInt(1);

        } catch (SQLException e){
            System.out.println("mysql sql fail : " + e.getMessage());

        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {}
        }
        if(ps != null){
            try{
                ps.close();
            } catch (SQLException e) {}
        }

        return result;
    }

    @Override
    public int delete(String param) {
        int result = 0;
        String sql = "delete from users where userid = ?";
        PreparedStatement ps = null;

        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, param);
            result = ps. executeUpdate();
        } catch (SQLException e) {
            System.out.println("mysql sql fail : " + e.getMessage());
        }

        if(ps != null) {
            try{
                ps.close();
            } catch (SQLException e) {}

        }
        return result;
    }

    @Override
    public int update(UsersDTO Param) {
        int result = 0;

        String sql = "update users set username = ?, userpassword = ?, userage = ?, useremail = ? where userid = ?";

        PreparedStatement ps = null;

        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, Param.getUserName());
            ps.setString(2, Param.getUserPassword());
            ps.setInt(3, Param.getUserAge());
            ps.setString(4, Param.getUserEmail());
            ps.setString(5, Param.getUserId());

            result = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("mysql sql fail : " + e.getMessage());
        }

        if(ps != null) {
            try{
                ps.close();
            } catch (SQLException e) {

            }
        }
        return result;
    }

    @Override
    public UsersDTO selectOne(String param) {
        UsersDTO result = null;

        String sql = "select * from users where userid = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, param);
            rs = ps.executeQuery();

            boolean first = rs.next();

            if(first){
                String userid = rs.getString("userid");
                String username = rs.getString("username");
                String userpassword = rs.getString("userpassword");
                int userage = rs.getInt("userage");
                String useremail = rs.getString("useremail");

                result = new UsersDTO(userid, username, userpassword, useremail, userage);

            } else{
                System.out.println("조회 결과 없음.");

            }

        } catch (SQLException e) {
            System.out.println("mysql sql fail : " + e.getMessage());
        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {}
        }

        if( ps != null) {
            try{
                ps.close();
            } catch (SQLException e) {}
        }



        return result;

    }

    @Override
    public List<UsersDTO> selectAll() {

        List<UsersDTO> result = null;

        String sql = "select * from users";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            result = new ArrayList<UsersDTO>();

            while(rs.next()){
                String userid = rs.getString("userid");
                String username = rs.getString("username");
                String userpassword = rs.getString("userpassword");
                int userage = rs.getInt("userage");
                String useremail = rs.getString("useremail");

                UsersDTO usersDTO = new UsersDTO(userid, username, userpassword, useremail, userage);

                result.add(usersDTO);
            }

        } catch (SQLException e) {
            System.out.println("mysql sql fail : " + e.getMessage());
        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {}
        }

        if(ps != null){
            try {
                ps.close();
            } catch (Exception e) {

            }
        }

        return result;
    }
}

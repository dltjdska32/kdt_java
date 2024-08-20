package dao;

import dto.UsersDTO;

import java.util.List;

public interface UserDAO {

    public int insert(UsersDTO param);

    public int delete(String param);

    public int update(UsersDTO param);

    public UsersDTO selectOne(String param);

    public List<UsersDTO> selectAll();
}

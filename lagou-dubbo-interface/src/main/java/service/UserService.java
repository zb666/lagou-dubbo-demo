package service;

import entity.Users;

import java.util.List;

public interface UserService {

    int register(Users user);

    List<Users> findUser(Users users);

    void updateUser(Users users);

    void deleteUser(int userId);

}
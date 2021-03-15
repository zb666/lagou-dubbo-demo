package service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import entity.Users;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import java.util.List;


//服务提供方
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int register(Users users) {
        return userMapper.register(users);
    }

    public List<Users> findUser(Users users) {
        return userMapper.findUser(users);
    }

    public void updateUser(Users user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }

}

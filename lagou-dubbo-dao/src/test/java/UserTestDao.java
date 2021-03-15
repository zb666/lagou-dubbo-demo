import com.alibaba.druid.filter.AutoLoad;
import entity.Users;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class UserTestDao {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void register(){
        Users users = new Users();
        users.setUsername("啊哈哈1");
        users.setPassword("1234561212a");
        users.setPhone("11111112");
        int register = userMapper.register(users);
        System.out.printf("UserRegister: "+register);
    }


    @Test
    public void findUsers(){
        Users users = new Users();
        users.setUsername("san");
        List<Users> user = userMapper.findUser(users);
        for (Users users1 : user) {
            System.out.printf(users1.toString());
        }
    }

    @Test
    public void updateUser(){
        Users users = new Users();
        users.setUsername("DemoA");
        users.setPhone("113456178");
        users.setPassword("password");
        users.setUid(4);
        userMapper.updateUser(users);
    }

    @Test
    public void deleteUser(){
        userMapper.deleteUser(1);
    }


}

import com.alibaba.dubbo.config.annotation.Reference;
import entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class UserTest {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Test
    public void findUser(){
        Users users = new Users();
        users.setUsername("san");
        List<Users> usersList = userService.findUser(users);
        for (Users users1 : usersList) {
            System.out.printf(users1.toString());
        }
    }


}

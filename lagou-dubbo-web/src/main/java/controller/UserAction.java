package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import java.util.List;

@Controller
public class UserAction {

    @Reference
    private UserService userService;

    @RequestMapping("findUser")
    public String findUser(){
        Users users = new Users();
        users.setUsername("san");
        List<Users> list = userService.findUser(users);
        for (Users users1 : list) {
            System.out.printf(users1.toString());
        }
        return "";
    }

}

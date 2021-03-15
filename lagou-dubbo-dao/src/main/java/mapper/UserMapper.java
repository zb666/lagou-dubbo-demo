package mapper;

import entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {

    int register(Users user);

    List<Users> findUser(Users users);

    void updateUser(Users users);

    void deleteUser(int userId);

}

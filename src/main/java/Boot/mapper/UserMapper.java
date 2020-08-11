package Boot.mapper;

import Boot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    public List<User> queryUserList();
    public User findById(int id);
}

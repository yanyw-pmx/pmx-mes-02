package Boot;


import Boot.domain.User;
import Boot.mapper.UserMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =  MySpringBootApplication.class)
public class JunitTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println( users);
    }

    @Test
    public void Redistest() throws JsonProcessingException {
        String userlist = redisTemplate.boundValueOps("user.finaAll").get();
        if(userlist == null){
            List<User> all = userMapper.queryUserList();
            /*转化jeson*/
            ObjectMapper objectMapper = new ObjectMapper();
            userlist = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("user.finaAll").set(userlist);
            System.out.println("从数据库获取");
        }
        else{
            System.out.println("从redis中获取");

        }
        System.out.println(userlist);
    }
}

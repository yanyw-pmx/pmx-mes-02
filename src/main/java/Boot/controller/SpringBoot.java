package Boot.controller;

import Boot.domain.User;
import Boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/springBoot")
public class SpringBoot {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/finaAll")
    @ResponseBody
    public List<User> finaAll() {
//        User user = (User) redisTemplate.opsForValue().get("user");
//
//        if(user==null){
//            List<User> users = userMapper.queryUserList();
//        }
//        System.out.println(user);
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
        return users;
    }

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public User findById(@PathVariable("id") int id){

           // User user = (User) redisTemplate.opsForValue().get("user");
           User user = (User) redisTemplate.opsForValue().get("user");
           if(user ==  null){
               user = userMapper.findById(id);
               redisTemplate.opsForValue().set("user",user);
               System.out.println("redis中不存user,从数据库读取");
           }
           else{
               System.out.println("redis中存在user为:"+user);
           }
           return user;
        }
}

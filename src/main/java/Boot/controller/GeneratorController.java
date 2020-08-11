package Boot.controller;


import Boot.domain.UserGeneretor;
import Boot.mapper.UserGeneretorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @Autowired
    private UserGeneretorMapper userGeneretorMapper;

    @RequestMapping("/findById/{userId}")
    public UserGeneretor findById(@PathVariable("userId") Integer userId){
       return userGeneretorMapper.selectByPrimaryKey(userId);
    }

}

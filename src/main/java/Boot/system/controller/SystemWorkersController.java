package Boot.system.controller;

import Boot.system.domain.SystemWorkers;
import Boot.system.mapper.SystemWorkersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin
@RequestMapping("/systemWorks")
@RestController
public class SystemWorkersController {

    @Autowired
    private SystemWorkersMapper systemWorkersMapper;

    @RequestMapping("/findAll")
    List<SystemWorkers> findAll(){
       return systemWorkersMapper.findAll();
    }

}

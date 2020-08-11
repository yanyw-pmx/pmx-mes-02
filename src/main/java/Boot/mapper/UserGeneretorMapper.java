package Boot.mapper;

import Boot.domain.UserGeneretor;
import Boot.domain.UserGeneretorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "userGeneretorMapper")
public interface UserGeneretorMapper {
    long countByExample(UserGeneretorExample example);

    int deleteByExample(UserGeneretorExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserGeneretor record);

    int insertSelective(UserGeneretor record);

    List<UserGeneretor> selectByExample(UserGeneretorExample example);

    UserGeneretor selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserGeneretor record, @Param("example") UserGeneretorExample example);

    int updateByExample(@Param("record") UserGeneretor record, @Param("example") UserGeneretorExample example);

    int updateByPrimaryKeySelective(UserGeneretor record);

    int updateByPrimaryKey(UserGeneretor record);
}
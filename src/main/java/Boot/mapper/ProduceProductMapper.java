package Boot.mapper;

import Boot.domain.ProduceProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "produceProductMapper")
public interface ProduceProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProduceProduct record);

    List<ProduceProduct> findAll();

    int insertSelective(ProduceProduct record);

    ProduceProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProduceProduct record);

    int updateByPrimaryKey(ProduceProduct record);
}
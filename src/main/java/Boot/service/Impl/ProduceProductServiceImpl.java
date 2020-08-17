package Boot.service.Impl;
import Boot.mapper.ProduceProductMapper;
import Boot.service.ProduceProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceProductServiceImpl implements ProduceProductService {

    @Autowired
    private ProduceProductMapper produceProductMapper;

    @Override
    public List<Boot.domain.ProduceProduct> findAll() {
        return produceProductMapper.findAll();
    }

    @Override
    public Boot.domain.ProduceProduct selectByPrimaryKey(Long id) {
        Boot.domain.ProduceProduct produceProduct = produceProductMapper.selectByPrimaryKey(id);
        return produceProduct;
    }
}

package Boot.product.service.Impl;
import Boot.product.mapper.ProduceProductMapper;
import Boot.product.service.ProduceProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceProductServiceImpl implements ProduceProductService {

    @Autowired
    private ProduceProductMapper produceProductMapper;

    @Override
    public List<Boot.product.domain.ProduceProduct> findAll() {
        return produceProductMapper.findAll();
    }

    @Override
    public Boot.product.domain.ProduceProduct selectByPrimaryKey(Long id) {
        Boot.product.domain.ProduceProduct produceProduct = produceProductMapper.selectByPrimaryKey(id);
        return produceProduct;
    }
}

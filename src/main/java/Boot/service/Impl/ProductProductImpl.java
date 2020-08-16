package Boot.service.Impl;

import Boot.domain.ProduceProduct;
import Boot.mapper.ProduceProductMapper;
import Boot.service.ProductProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductProductImpl implements ProductProduct {

    @Autowired
    private ProduceProductMapper produceProductMapper;

    @Override
    public List<ProduceProduct> findAll() {
        return produceProductMapper.findAll();
    }

    @Override
    public ProduceProduct selectByPrimaryKey(Long id) {
        ProduceProduct produceProduct = produceProductMapper.selectByPrimaryKey(id);
        return produceProduct;
    }
}

package Boot.product.service;


import Boot.product.domain.ProduceProduct;

import java.util.List;

public interface ProduceProductService {
    List<ProduceProduct> findAll() ;
    Boot.product.domain.ProduceProduct selectByPrimaryKey(Long id);
}

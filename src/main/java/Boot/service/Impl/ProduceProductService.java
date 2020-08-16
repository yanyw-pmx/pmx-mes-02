package Boot.service.Impl;


import Boot.domain.ProduceProduct;

import java.util.List;

public interface ProduceProductService {
    List<ProduceProduct> findAll() ;
    Boot.domain.ProduceProduct selectByPrimaryKey(Long id);
}

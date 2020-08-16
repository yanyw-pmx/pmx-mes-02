package Boot.service;

import Boot.domain.ProduceProduct;

import java.util.List;

public interface ProductProduct {
    List<ProduceProduct> findAll() ;
    ProduceProduct selectByPrimaryKey(Long id);
}

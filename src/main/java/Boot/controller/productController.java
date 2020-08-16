package Boot.controller;

import Boot.domain.ProduceProduct;
import Boot.service.Impl.ProductProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("/productproduct")
@RestController
public class productController {
    @Autowired
    private ProductProductImpl productProduct;

    @RequestMapping("/selectByPrimaryKey/{id}")
    ProduceProduct selectByPrimaryKey(@PathVariable("id") Long id){
        ProduceProduct produceProduct = productProduct.selectByPrimaryKey(id);
        System.out.println(produceProduct);
          return produceProduct;
    }

    @RequestMapping("/finaAll")
    List<ProduceProduct> finaAll(){
        List<ProduceProduct> all = productProduct.findAll();
        System.out.println(all);
        return all;
    }
}

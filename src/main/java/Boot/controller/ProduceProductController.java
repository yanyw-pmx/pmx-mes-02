package Boot.controller;



import Boot.domain.ProduceProduct;
import Boot.service.Impl.ProduceProductServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RequestMapping("/produceproduct")
@RestController
public class ProduceProductController {
    @Autowired
    private ProduceProductServiceImpl produceProductService;

    @RequestMapping("/selectByPrimaryKey/{id}")
    ProduceProduct selectByPrimaryKey(@PathVariable("id") Long id) {
        ProduceProduct produceProduct = produceProductService.selectByPrimaryKey(id);
        System.out.println(produceProduct);
        return produceProduct;
    }

    @RequestMapping("/finaAll")
    List<ProduceProduct> finaAll() {
        List<ProduceProduct> all = produceProductService.findAll();
        PageInfo pageInfo = new PageInfo<>(all);
        System.out.println(all);
        return all;
    }
}

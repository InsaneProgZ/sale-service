package yan.trainning.saleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yan.trainning.saleservice.model.Sale;
import yan.trainning.saleservice.service.SaleService;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping
    Sale createSale (@RequestBody Sale sale) {
        return saleService.registerSalve(sale);
    }
    @PostMapping("/valid")
    void validExists (@RequestBody Sale sale) {
        saleService.updateItem(sale.getId());
    }

    @GetMapping("/{id}")
    Sale findSaleId (@PathVariable String id){
        return saleService.findId(id);
    }

    @GetMapping
    List<Sale> findSaleName (@RequestHeader String name){
        return saleService.findByName(name);
    }

}

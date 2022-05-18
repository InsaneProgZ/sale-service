package yan.trainning.saleservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yan.trainning.saleservice.model.Sale;
import yan.trainning.saleservice.repository.SaleRepository;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public Sale registerSalve (Sale sale) {
        return saleRepository.save(sale);
    }

    public void updateItem (String saleId) {
        Sale sale= saleRepository.findById(saleId).orElseThrow();
        sale.setValue(sale.getValue()-1);
        saleRepository.save(sale);
    }

    public Sale findId (String id) {
        return saleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("não existe"));
    }

    public List<Sale> findByName (String name) {
        return saleRepository.findByName(name);
    }

}

package yan.trainning.saleservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yan.trainning.saleservice.model.Sale;
import yan.trainning.saleservice.model.SaleDTO;
import yan.trainning.saleservice.model.SaleResponse;
import yan.trainning.saleservice.repository.SaleRepository;

import java.util.HashMap;
import java.util.List;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public Sale registerSalve(SaleDTO saleDTO) {
        return saleRepository.save(saleDTO.toSale());
    }

    public SaleResponse findIds(List<String> ids) {
        SaleResponse saleResponse = new SaleResponse(new HashMap<>());
        saleRepository.findAllById(ids)
                .forEach(sale ->
                        saleResponse.getValue().put(sale.getId(), sale.getValue()));
        return saleResponse;
    }
}

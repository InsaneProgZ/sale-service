package yan.trainning.saleservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import yan.trainning.saleservice.model.Sale;

import java.util.List;

public interface SaleRepository extends MongoRepository<Sale, String> {

    List<Sale> findByName (String name);
}

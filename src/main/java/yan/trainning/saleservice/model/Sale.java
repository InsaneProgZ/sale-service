package yan.trainning.saleservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("sale")
public class Sale {

    @Id
    private String id;

    private Long value;

    private String name;

    public Sale(Long value, String name, String id) {
        this.value = value;
        this.name = name;
        this.id = id;
    }
}

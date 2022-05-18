package yan.trainning.saleservice.model;

import com.mongodb.lang.NonNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("sale")
public class Sale {

    @Id
    private String id;

    private Integer productId;

    private Long value;

    private String name;

}

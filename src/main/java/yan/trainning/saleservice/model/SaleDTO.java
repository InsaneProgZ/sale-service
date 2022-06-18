package yan.trainning.saleservice.model;

import lombok.Data;

@Data
public class SaleDTO {

    private Long productId;

    private Long value;

    private String name;

    public Sale toSale() {
        return new Sale(value, name, productId.toString());
    }

}

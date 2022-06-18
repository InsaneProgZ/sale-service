package yan.trainning.saleservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class SaleResponse {

    private HashMap<String, Long> value;
}

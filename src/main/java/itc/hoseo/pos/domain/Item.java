package itc.hoseo.pos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    private Integer id;
    private String name;
    private Integer price;
    private Integer stockQuantity;
    private Integer addStock;
    private Integer removeStock;



}

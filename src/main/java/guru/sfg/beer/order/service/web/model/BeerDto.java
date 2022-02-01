package guru.sfg.beer.order.service.web.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class BeerDto {
    private UUID beerId;
    private String beerName;
    private String beerStyle;
    private String upc;
    private BigDecimal price;
}

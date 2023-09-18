package orderfood.com.github.fancytanya.orderfood.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Meal {
    private String name;
    private BigDecimal price;
    private Cuisine cuisine;
}

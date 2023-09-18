package orderfood.com.github.fancytanya.orderfood.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "orders")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Lunch lunch;

    @OneToOne
    private Drink drink;

    private Cuisine cuisine;

    public Order(Lunch lunch, Drink drink, Cuisine cuisine) {
        this.lunch = lunch;
        this.drink = drink;
        this.cuisine = cuisine;
    }

    public Order(Lunch lunch, Cuisine cuisine) {
        this.lunch = lunch;
        this.cuisine = cuisine;
    }

    public Order(Drink drink, Cuisine cuisine) {
        this.drink = drink;
        this.cuisine = cuisine;
    }

}

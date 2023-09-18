package orderfood.com.github.fancytanya.orderfood.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Drink extends Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addition_id")
    private DrinkAddition addition;

    public Drink() {
    }

    public Drink(DrinkAddition addition) {
        this.addition = addition;
    }
}

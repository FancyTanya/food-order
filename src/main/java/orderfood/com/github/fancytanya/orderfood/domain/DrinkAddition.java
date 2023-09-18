package orderfood.com.github.fancytanya.orderfood.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class DrinkAddition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String iceCubes;

    private String lemon;

    private String anotherAdd;

    public DrinkAddition(Builder builder) {
        iceCubes = builder.iceCubes;
        lemon = builder.lemon;
    }

    public static class Builder {
        public String iceCubes;
        public String lemon;
        public String anotherAdd;

        public Builder() {
        }

        public Builder addIceCubes(String val) {
            iceCubes = val;
            return this;
        }

        public Builder addLemon(String val) {
            lemon = val;
            return this;
        }

        public Builder addAnotherAdd(String val) {
            anotherAdd = val;
            return this;
        }

        public Builder addLemonAndIceCubes(String iceCubes, String lemon) {
            this.iceCubes = iceCubes;
            this.lemon = lemon;
            return this;
        }

        public DrinkAddition build() {
            return new DrinkAddition(this);
        }

    }
}

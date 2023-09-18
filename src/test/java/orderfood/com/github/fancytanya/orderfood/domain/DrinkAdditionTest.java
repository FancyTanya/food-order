package orderfood.com.github.fancytanya.orderfood.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkAdditionTest {

    @Test
    void createDrinkWithoutAdds() {
        Drink drink = new Drink();
        assertNull(drink.getAddition());
    }

    @Test
    void createDrinkWithLemon() {
        Drink drink = new Drink(new DrinkAddition.Builder().addLemon("lemon").build());
        assertNotNull(drink.getAddition());
    }

    @Test
    void createDrinkWithLemonAndIceCubes() {
        Drink drink = new Drink(new DrinkAddition.Builder()
                .addLemon("lemon")
                .addIceCubes("ice cubes").build());

        assertNotNull(drink.getAddition());
    }

}
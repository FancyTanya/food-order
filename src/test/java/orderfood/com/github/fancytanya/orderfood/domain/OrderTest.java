package orderfood.com.github.fancytanya.orderfood.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OrderTest {

    private final Drink drink = new Drink();
    private final Lunch lunch = new Lunch();
    private final Cuisine cuisine = Cuisine.MEXICAN;

    @Test
    void addLunchToOder() {
        Order order = new Order(lunch, cuisine);
        assertNotNull(order.getLunch());
    }

    @Test
    void addDrinkToOrder() {
        Order order = new Order(drink, cuisine);
        assertNotNull(order.getDrink());
    }

    @Test
    void addLunchAndDrinkToOrder() {
        Order order = new Order(lunch, drink, cuisine);
        assertNotNull(order.getDrink());
    }

}
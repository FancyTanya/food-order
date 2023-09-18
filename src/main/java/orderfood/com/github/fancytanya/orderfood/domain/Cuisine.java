package orderfood.com.github.fancytanya.orderfood.domain;

import lombok.Getter;

@Getter
public enum Cuisine {
    POLISH("Polish"),
    MEXICAN("Mexican"),
    ITALIAN("Italian");

    private final String cuisine;

    Cuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}

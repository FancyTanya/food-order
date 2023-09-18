package orderfood.com.github.fancytanya.orderfood.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
public class Lunch extends Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MainCourse mainCourse;

    @OneToOne
    private Dessert dessert;


}

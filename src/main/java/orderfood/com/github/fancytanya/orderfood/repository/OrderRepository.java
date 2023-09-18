package orderfood.com.github.fancytanya.orderfood.repository;

import orderfood.com.github.fancytanya.orderfood.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

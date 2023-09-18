package orderfood.com.github.fancytanya.orderfood.service;

import lombok.RequiredArgsConstructor;
import orderfood.com.github.fancytanya.orderfood.domain.Order;
import orderfood.com.github.fancytanya.orderfood.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;


    public Order save(Order newOrder) {
        return repository.save(newOrder);
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return repository.findById(id);
    }
}

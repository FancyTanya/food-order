package orderfood.com.github.fancytanya.orderfood.controller;

import lombok.RequiredArgsConstructor;
import orderfood.com.github.fancytanya.orderfood.domain.Order;
import orderfood.com.github.fancytanya.orderfood.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OrderController {

    private final OrderService service;

    @PostMapping(value = "/orders",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Order> createOrder(@RequestBody Order newOrder) throws ServerException {

        Order order = service.save(newOrder);

        if (order == null) {
            throw new ServerException("ServerException");
        } else {
            return new ResponseEntity<>(order, HttpStatus.CREATED);
        }
    }

    @GetMapping(value = "/all-orders")
    public ResponseEntity<List<Order>> findAllOrders() {
        List<Order> findAll = service.findAll();
        return new ResponseEntity<>(findAll, HttpStatus.OK);
    }

    @GetMapping(value = "/order-by-id")
    public ResponseEntity<Optional<Order>> findOrderById(@RequestParam(value = "id") Long id) {
        Optional<Order> orderById = service.getOrderById(id);
        return new ResponseEntity<>(orderById, HttpStatus.OK);
    }
}

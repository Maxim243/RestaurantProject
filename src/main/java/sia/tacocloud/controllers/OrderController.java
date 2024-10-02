package sia.tacocloud.controllers;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sia.tacocloud.dto.request.OrderDTO;
import sia.tacocloud.dto.responce.OrderTacoResponseDTO;
import sia.tacocloud.service.OrderService;


@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderTacoResponseDTO> processOrder(@Valid @RequestBody OrderDTO orderDTO) {
        return ResponseEntity.ok(orderService.createOrder(orderDTO));
    }

//    @GetMapping("/current")
//    public String orderForm(Model model) {
//        model.addAttribute("order", new Order());
//        return "orderForm";
//    }
}

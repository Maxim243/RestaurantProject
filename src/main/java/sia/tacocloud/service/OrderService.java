package sia.tacocloud.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sia.tacocloud.dto.request.OrderDTO;
import sia.tacocloud.dto.responce.OrderTacoResponseDTO;
import sia.tacocloud.entity.Order;
import sia.tacocloud.mappers.OrderMapper;
import sia.tacocloud.repository.OrderRepository;

@Slf4j
@Service
@AllArgsConstructor
public class OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderRepository orderRepository;

    public OrderTacoResponseDTO createOrder(OrderDTO orderDTO) {

//        log.info("Order: " + orderDTO);


//        Order order = Order.builder()
//                .name(orderDTO.getName())
//                .street(orderDTO.getStreet())
//                .city(orderDTO.getCity())
//                .state(orderDTO.getState())
//                .zip(orderDTO.getZip())
//                .ccNumber(orderDTO.getCcNumber())
//                .ccExpiration(orderDTO.getCcExpiration())
//                .createdAt(orderDTO.getCreatedAt())
//                .orderedTacos(orderDTO.getTacosDTO())
//                .build();

        Order order = convertToOrderEntity(orderDTO);
        orderRepository.save(order);
        return convertToTacoOrderResponseDTO(order);
    }

    public OrderTacoResponseDTO convertToTacoOrderResponseDTO(Order order) {
        return orderMapper.toDTO(order);
    }

    public Order convertToOrderEntity(OrderDTO orderDTO) {
        return orderMapper.toEntity(orderDTO);
    }
}

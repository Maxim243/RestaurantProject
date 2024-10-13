package sia.tacocloud.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sia.tacocloud.dto.request.OrderDTO;
import sia.tacocloud.dto.responce.OrderTacoResponseDTO;
import sia.tacocloud.entity.Order;

@Mapper(componentModel = "spring", uses = TacoMapper.class)
public interface OrderMapper {
    OrderTacoResponseDTO toDTO(Order order);

    Order toEntity(OrderDTO orderDTO);
}


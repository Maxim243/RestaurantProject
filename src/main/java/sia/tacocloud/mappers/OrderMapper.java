package sia.tacocloud.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sia.tacocloud.dto.request.OrderDTO;
import sia.tacocloud.dto.responce.OrderTacoResponseDTO;
import sia.tacocloud.entity.Order;

@Mapper(componentModel = "spring", uses = TacoMapper.class)
public interface OrderMapper {
//    @Mapping(target = "orderedTacos", source = "orderedTacos")
    OrderTacoResponseDTO toDTO(Order order);

//    @Mapping(target = "orderedTacos", source = "orderedTacos")
    Order toEntity(OrderDTO orderDTO);
}


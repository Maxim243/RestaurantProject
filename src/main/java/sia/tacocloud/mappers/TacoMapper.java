package sia.tacocloud.mappers;

import org.mapstruct.Mapper;
import sia.tacocloud.dto.request.TacoDTO;
import sia.tacocloud.entity.Taco;

@Mapper(componentModel = "spring")
public interface TacoMapper {
    TacoDTO toDTO(Taco taco);
    Taco toEntity(TacoDTO tacoDTO);
}


package sia.tacocloud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TacoDTO {
    @JsonProperty("name")
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @JsonProperty("ingredients")
    @NotNull
    @Size(min = 1, message = "Must be at least 1 ingredient")
    private List<IngredientDTO> ingredients;
}

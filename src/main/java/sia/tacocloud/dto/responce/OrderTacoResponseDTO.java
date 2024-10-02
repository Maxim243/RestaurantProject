package sia.tacocloud.dto.responce;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sia.tacocloud.dto.request.TacoDTO;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderTacoResponseDTO {
    @JsonProperty("name")
    @NotNull
    private String name;
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("taco")
    private List<TacoDTO> orderedTacos;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public List<TacoDTO> getOrderedTacos() {
//        return orderedTacos;
//    }
//
//    public void setOrderedTacos(List<TacoDTO> orderedTacos) {
//        this.orderedTacos = orderedTacos;
//    }
}

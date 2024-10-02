package sia.tacocloud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class OrderDTO {

    @JsonProperty("name")
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @JsonProperty("street")
    @NotNull
    private String street;

    @JsonProperty("city")
    @NotNull
    private String city;

    @JsonProperty("state")
    @NotNull
    private String state;

    @JsonProperty("zip")
    @NotNull
    private String zip;

    @JsonProperty("ccExpiration")
    @NotNull
    private String ccExpiration;

    @NotNull
    @JsonProperty("ccNumber")
    private String ccNumber;

    @NotNull
    @JsonProperty("createdAt")
    private Date createdAt;

    @JsonProperty("tacoDTO")
    @NotNull
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
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//
//    public String getCcExpiration() {
//        return ccExpiration;
//    }
//
//    public void setCcExpiration(String ccExpiration) {
//        this.ccExpiration = ccExpiration;
//    }
//
//    public String getCcNumber() {
//        return ccNumber;
//    }
//
//    public void setCcNumber(String ccNumber) {
//        this.ccNumber = ccNumber;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
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

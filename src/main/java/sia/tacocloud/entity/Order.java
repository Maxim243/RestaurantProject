package sia.tacocloud.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "taco_order")
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private Date createdAt;

    @OneToMany(mappedBy = "order")
    private List<Taco> orderedTacos;

    @PrePersist
    void placedAt() {
        this.createdAt = new Date();
    }

//    public void addTacoDesign(Taco tacoDesign) {
//        this.orderedTacos.add(tacoDesign);
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
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
//    public String getCcNumber() {
//        return ccNumber;
//    }
//
//    public void setCcNumber(String ccNumber) {
//        this.ccNumber = ccNumber;
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
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public List<Taco> getOrderedTacos() {
//        return orderedTacos;
//    }
//
//    public void setOrderedTacos(List<Taco> orderedTacos) {
//        this.orderedTacos = orderedTacos;
//    }
}

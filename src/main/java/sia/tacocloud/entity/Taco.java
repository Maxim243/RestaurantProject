package sia.tacocloud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "tacos")
@Builder
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Date createdAt;

    @OneToMany(mappedBy = "taco")
    private List<Ingredient> ingredients;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}

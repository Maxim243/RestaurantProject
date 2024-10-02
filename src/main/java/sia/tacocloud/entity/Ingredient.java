package sia.tacocloud.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Data
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    private Long id;
    private String name;
    private Type type;
    @ManyToOne
    @JoinColumn(name = "taco_id", nullable = false)
    private Taco taco;
}

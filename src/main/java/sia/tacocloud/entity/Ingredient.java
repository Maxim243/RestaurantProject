package sia.tacocloud.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "taco_id", nullable = false)
    private Taco taco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Taco getTaco() {
        return taco;
    }

    public void setTaco(Taco taco) {
        this.taco = taco;
    }
}

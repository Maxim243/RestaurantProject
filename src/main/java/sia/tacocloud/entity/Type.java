package sia.tacocloud.entity;

import lombok.Getter;

@Getter
public enum Type {
    WRAP("WRAP"),
    PROTEIN("PROTEIN"),
    VEGGIES("VEGGIES"),
    CHEESE("CHEESE"),
    SAUCE("SAUCE");

    private final String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }
}


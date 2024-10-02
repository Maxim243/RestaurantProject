package sia.tacocloud.repository;

import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sia.tacocloud.entity.Ingredient;

import java.util.Optional;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    @Override
    @NonNull
    Optional<Ingredient> findById(@NonNull Long id);
}

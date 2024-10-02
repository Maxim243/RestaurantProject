package sia.tacocloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sia.tacocloud.dto.request.IngredientDTO;
import sia.tacocloud.repository.IngredientRepository;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

//    public IngredientDTO getIngredientById(Long id) {
//        return ingredientRepository.findById(id).map(
//                        ingredient -> IngredientDTO
//                                .builder()
//                                .name(ingredient.getName())
//                                .build())
//                .orElseThrow(() -> new NullPointerException(String.format("Ingredient not found with id: %d", id)));
//    }
}

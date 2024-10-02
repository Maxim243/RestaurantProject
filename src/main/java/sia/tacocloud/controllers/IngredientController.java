package sia.tacocloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sia.tacocloud.dto.request.IngredientDTO;
import sia.tacocloud.service.IngredientService;

@RestController
@RequestMapping("/v1")
public class IngredientController {
    @Autowired
    public IngredientService ingredientService;

//    @GetMapping(value = "/ingredient/{id}")
//    public IngredientDTO findOneIngredient(@PathVariable String id) {
//        return ingredientService.getIngredientById(Long.valueOf(id));
//    }
}

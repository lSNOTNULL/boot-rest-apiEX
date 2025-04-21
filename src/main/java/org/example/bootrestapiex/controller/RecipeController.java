package org.example.bootrestapiex.controller;

import org.apache.coyote.BadRequestException;
import org.example.bootrestapiex.model.dto.RecipeDTO;
import org.example.bootrestapiex.model.entity.Recipe;
import org.example.bootrestapiex.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
//        Recipe r = new Recipe();
//        r.setName("커리");
//        r.setDescription("맛있는 커리");
//        recipeService.save(r);
        return ResponseEntity.ok(recipeService.findAll());
    }

    @PostMapping
    public ResponseEntity<Recipe> addRecipe(@RequestBody RecipeDTO recipeDTO) throws BadRequestException {
//        try {
            Recipe recipe = new Recipe();
            recipe.setName(recipeDTO.name());
            recipe.setDescription(recipeDTO.description());
//        return recipeService.save(recipe);
            return ResponseEntity.status(HttpStatus.CREATED).body(recipeService.save(recipe));
//        } catch (BadRequestException e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // Service에서 이름입력 X 일때 넘어온 예외처리를 BAD_REQUEST 처리.
//        }
    }

}

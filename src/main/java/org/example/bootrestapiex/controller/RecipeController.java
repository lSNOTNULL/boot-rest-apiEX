package org.example.bootrestapiex.controller;

import org.example.bootrestapiex.model.entity.Recipe;
import org.example.bootrestapiex.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        Recipe r = new Recipe();
        r.setName("커리");
        r.setDescription("맛있는 커리");
        recipeService.save(r);
        return recipeService.findAll();
    }
}

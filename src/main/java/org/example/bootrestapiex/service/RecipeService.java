package org.example.bootrestapiex.service;

import org.apache.coyote.BadRequestException;
import org.example.bootrestapiex.model.entity.Recipe;

import java.util.List;

public interface RecipeService {
    public List<Recipe> findAll();

    public Recipe save(Recipe recipe) throws BadRequestException;

    void delete(Long id);

    Recipe findById(Long id);
}

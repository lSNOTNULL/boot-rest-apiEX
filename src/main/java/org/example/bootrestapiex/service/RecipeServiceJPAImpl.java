package org.example.bootrestapiex.service;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.example.bootrestapiex.model.entity.Recipe;
import org.example.bootrestapiex.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceJPAImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe save(Recipe recipe) throws BadRequestException {
        if(recipe.getName() == null || recipe.getName().isEmpty()) {
            throw new BadRequestException("이름 없음"); // 이름 입력 안하면 BadRequest 처리
        }
        return recipeRepository.save(recipe);
    }
}

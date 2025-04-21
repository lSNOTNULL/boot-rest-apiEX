package org.example.bootrestapiex.repository;

import org.example.bootrestapiex.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Spring
public interface RecipeRepository  extends JpaRepository<Recipe, Long> {
}

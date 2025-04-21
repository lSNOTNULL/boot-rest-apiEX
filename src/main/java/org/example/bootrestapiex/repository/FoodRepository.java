package org.example.bootrestapiex.repository;

import org.example.bootrestapiex.model.entity.Food;
import org.example.bootrestapiex.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FoodRepository extends JpaRepository<Food, Long> {
}

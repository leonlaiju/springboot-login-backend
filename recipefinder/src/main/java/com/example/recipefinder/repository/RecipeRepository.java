package com.example.recipefinder.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.recipefinder.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
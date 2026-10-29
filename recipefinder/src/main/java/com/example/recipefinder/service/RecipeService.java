package com.example.recipefinder.service;
import java.util.List;
import com.example.recipefinder.model.Recipe;
public interface RecipeService {
	
	Recipe addRecipe(Recipe recipe);
	List<Recipe> getAllRecipes();
	Recipe getRecipeById(Long id);
	Recipe updateRecipe(Long id, Recipe recipe);
	void deleteRecipe(Long id);
}
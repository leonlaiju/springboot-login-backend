package com.example.recipefinder.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.recipefinder.model.Recipe;
import com.example.recipefinder.repository.RecipeRepository;
@Service
public class RecipeServiceImpl implements RecipeService {
	@Autowired
	private RecipeRepository repository;
	@Override
	public Recipe addRecipe(Recipe recipe) {
		return repository.save(recipe);
	}
	@Override
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}
	@Override
	public Recipe getRecipeById(Long id) {
		return repository.findById(id).orElse(null);
	}
	@Override
	public Recipe updateRecipe(Long id, Recipe recipe) {
		Recipe existingRecipe = repository.findById(id).orElse(null);
		if (existingRecipe != null) {
			existingRecipe.setDishName(recipe.getDishName());
			existingRecipe.setCategory(recipe.getCategory());
			existingRecipe.setArea(recipe.getArea());
			existingRecipe.setImage(recipe.getImage());
			existingRecipe.setInstructions(recipe.getInstructions());
			return repository.save(existingRecipe);
		}
		
		return null;
	}
	@Override
	public void deleteRecipe(Long id) {
		repository.deleteById(id);
	}
}
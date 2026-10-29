package com.example.recipefinder.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.recipefinder.model.Recipe;
import com.example.recipefinder.service.RecipeService;
@RestController
@RequestMapping("/recipes")
@CrossOrigin("*")
public class RecipeController {
	@Autowired
	private RecipeService recipeService;
	// Add Recipe
	@PostMapping
	public Recipe addRecipe(@RequestBody Recipe recipe) {
		return recipeService.addRecipe(recipe);
	}

	// Get All Recipes
	@GetMapping
	public List<Recipe> getAllRecipes() {
		return recipeService.getAllRecipes();
	}
	// Get Recipe by ID
	@GetMapping("/{id}")
	public Recipe getRecipeById(@PathVariable Long id) {
		return recipeService.getRecipeById(id);
	}
	// Update Recipe
	@PutMapping("/{id}")
	public Recipe updateRecipe(@PathVariable Long id,
			@RequestBody Recipe recipe) {
		return recipeService.updateRecipe(id, recipe);
	}
	// Delete Recipe
	@DeleteMapping("/{id}")
	public String deleteRecipe(@PathVariable Long id) {
		recipeService.deleteRecipe(id);
		return "Recipe Deleted Successfully";
	}
}
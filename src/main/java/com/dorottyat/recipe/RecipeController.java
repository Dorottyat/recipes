package com.dorottyat.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping(path = "/recipes")
    public Iterable<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @GetMapping(path = "/recipes/{id}")
    public Optional<Recipe> getRecipeById(@PathVariable int id) {
        return recipeRepository.findById(id);
    }

    @PostMapping(path = "/recipes")
    public void postRecipe(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
    }

}

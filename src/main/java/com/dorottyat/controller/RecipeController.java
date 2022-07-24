package com.dorottyat.controller;

import com.dorottyat.model.Recipe;
import com.dorottyat.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/recipes")
    public Iterable<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/recipes")
    public void postRecipe(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping(path = "/recipes/{id}")
    public void deleteRecipeById(@PathVariable int id) {
        recipeRepository.deleteById(id);
    }

}

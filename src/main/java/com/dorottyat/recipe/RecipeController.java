package com.dorottyat.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping(path = "/recipes")
    public Iterable<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @PostMapping(path = "/recipes")
    public void postRecipe(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
    }

}

package com.dorottyat.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RecipeController {
    private final ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeController() {
        // adding fake recipes
        recipes.add(new Recipe("test", 1, 60, new ArrayList<>(), new ArrayList<>(), "test"));
        recipes.add(new Recipe("test2", 1, 60, new ArrayList<>(), new ArrayList<>(), "test2"));
        recipes.add(new Recipe("test3", 1, 60, new ArrayList<>(), new ArrayList<>(), "test3"));
    }

    @GetMapping(path = "/recipes")
    public ArrayList<Recipe> getAllRecipes() {
        return recipes;
    }

    @PostMapping(path = "/recipes")
    public void postRecipe(@RequestBody Recipe recipe) {
        recipes.add(recipe);
    }

}

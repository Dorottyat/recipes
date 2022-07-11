package com.dorottyat.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @GetMapping(path = "/recipes")
    public String getAllRecipes() {
        return "hello";
    }

}

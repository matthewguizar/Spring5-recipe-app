package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.commands.RecipeCommand;
import com.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

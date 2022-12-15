package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.commands.IngredientCommand;
import com.springframework.spring5recipeapp.domain.Ingredient;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand savedCommand);

    void deleteById(Long recipeId, Long idToDelete);
}

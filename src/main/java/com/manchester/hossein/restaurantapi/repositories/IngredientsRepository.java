package com.manchester.hossein.restaurantapi.repositories;

import com.manchester.hossein.restaurantapi.domain.food.Ingredients;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface IngredientsRepository {

    void addIngredient(Ingredients ingredients);
    Ingredients getIngredientById(UUID id);
    Collection<Ingredients> getAllIngredients();
    Optional<Ingredients> deleteIngredientById(UUID id);
}

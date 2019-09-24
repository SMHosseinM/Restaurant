package com.manchester.hossein.restaurantapi.infrastructure.inMemory;

import com.manchester.hossein.restaurantapi.domain.food.Ingredients;
import com.manchester.hossein.restaurantapi.repositories.IngredientsRepository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InMemoryIngredientRepository implements IngredientsRepository {

    Map<UUID, Ingredients> ingredientDatabase = new ConcurrentHashMap<>();

    @Override
    public void addIngredient(Ingredients ingredients) {
        ingredientDatabase.put(ingredients.getId(), ingredients);
    }

    @Override
    public Ingredients getIngredientById(UUID id) {
        return ingredientDatabase.get(id);
    }

    @Override
    public Collection<Ingredients> getAllIngredients() {
        return ingredientDatabase.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Ingredients> deleteIngredientById(UUID id) {
        return Optional.ofNullable(ingredientDatabase.remove(id));
    }
}

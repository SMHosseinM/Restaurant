package com.manchester.hossein.restaurantapi.repositories;

import com.manchester.hossein.restaurantapi.domain.food.Food;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface foodRepository {

    void addFood(final Food food);
    Optional<Food> deleteFood(UUID foodId);
    Food getFoodById(UUID id);
    Collection<Food> getAllFoods();
}

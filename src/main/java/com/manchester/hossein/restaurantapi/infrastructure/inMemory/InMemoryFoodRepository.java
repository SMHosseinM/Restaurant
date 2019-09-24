package com.manchester.hossein.restaurantapi.infrastructure.inMemory;

import com.manchester.hossein.restaurantapi.domain.food.Food;
import com.manchester.hossein.restaurantapi.repositories.foodRepository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InMemoryFoodRepository implements foodRepository {

    Map<UUID, Food> foodDatabase = new ConcurrentHashMap<>();

    @Override
    public void addFood(Food food) {
        foodDatabase.put(food.getId(), food);
    }

    @Override
    public Optional<Food> deleteFood(UUID foodId) {
        return Optional.ofNullable(foodDatabase.get(foodId));
    }

    @Override
    public Food getFoodById(UUID id) {
        return foodDatabase.get(id);
    }

    @Override
    public Collection<Food> getAllFoods() {
        return foodDatabase.values().stream().collect(Collectors.toList());
    }
}

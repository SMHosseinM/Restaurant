package com.manchester.hossein.restaurantapi.infrastructure.inMemory;

import com.manchester.hossein.restaurantapi.domain.food.Beverage;
import com.manchester.hossein.restaurantapi.repositories.BeverageRepository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InMemoryBeverageRepository implements BeverageRepository {

    Map<UUID, Beverage> beverageDatabase = new ConcurrentHashMap<>();

    @Override
    public void addBeverage(Beverage beverage) {
        beverageDatabase.put(beverage.getId(), beverage);
    }

    @Override
    public Beverage getBeverageById(UUID id) {
        return beverageDatabase.get(id);
    }

    @Override
    public Collection<Beverage> getBeverages() {
        return beverageDatabase.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Beverage> deleteBeverageById(UUID id) {
        return Optional.ofNullable(beverageDatabase.remove(id));
    }
}

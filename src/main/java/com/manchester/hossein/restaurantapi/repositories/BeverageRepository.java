package com.manchester.hossein.restaurantapi.repositories;

import com.manchester.hossein.restaurantapi.domain.food.Beverage;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface BeverageRepository {

    void addBeverage(Beverage beverage);
    Beverage getBeverageById(UUID id);
    Collection<Beverage> getBeverages();
    Optional<Beverage> deleteBeverageById(UUID id);
}

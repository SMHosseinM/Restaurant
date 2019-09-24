package com.manchester.hossein.restaurantapi.domain.food;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Ingredients {

    private final UUID id;
    private final String name;
    private final double price;
    private static final Map<UUID, Ingredients> listOfIngredients = new HashMap<>();

    public Ingredients(UUID id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Map<UUID, Ingredients> getListOfIngredients() {
        return listOfIngredients;
    }
}

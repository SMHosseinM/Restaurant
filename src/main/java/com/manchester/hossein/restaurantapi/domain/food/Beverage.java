package com.manchester.hossein.restaurantapi.domain.food;

import java.util.*;

public class Beverage {

    private final UUID id;
    private final String name;
    private final double price;
    private final static Map<UUID, Beverage> listOfAllBeverages = new HashMap<>();

    public Beverage(UUID id, String name, double price) {
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

    public static Map<UUID, Beverage> getListOfAllBeverages() {
        return listOfAllBeverages;
    }
}

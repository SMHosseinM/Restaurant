package com.manchester.hossein.restaurantapi.domain.food;

import java.util.*;

public class Dessert {
    private final UUID id;
    private final String name;
    private final double price;
    private final static Map<UUID, Dessert> listOfAvailableDesserts = new HashMap<>();

    public Dessert(UUID id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Map<UUID, Dessert> getListOfAvailableDesserts() {
        return listOfAvailableDesserts;
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
}

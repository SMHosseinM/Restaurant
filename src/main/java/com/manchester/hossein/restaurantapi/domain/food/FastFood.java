package com.manchester.hossein.restaurantapi.domain.food;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class FastFood extends Food {

    private static final double MEAL_PRICE = 1.99;
    private boolean meal;

    public FastFood(UUID id, String name, String originality, boolean meal) {
        super(id, name, originality);
        this.meal = meal;
    }

    public static FastFood burger(UUID id, String name, String originality, Ingredients[] ingredients, boolean meal){
        return new FastFood(id, name, originality, meal);
    }

    public static FastFood pizza(UUID id, String name, String originality, Ingredients[] ingredients, boolean meal){
        return new FastFood(id, name, originality, meal);
    }

    @Override
    public double foodPrice(ArrayList<Ingredients> ingredients) {
        double price = 0;

        price = ingredients.stream().mapToDouble(x -> x.getPrice()).sum();

        return price + MEAL_PRICE;
    }
}

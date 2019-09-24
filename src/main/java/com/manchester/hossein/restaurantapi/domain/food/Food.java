package com.manchester.hossein.restaurantapi.domain.food;

import java.util.*;

public abstract class Food {
    private final UUID id;
    private final String name;
    private final String originality;
    private List<Ingredients> ingredients;

    public Food(UUID id, String name, String originality) {
        this.id = id;
        this.name = name;
        this.originality = originality;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredients ingredients){
        this.ingredients.add(ingredients);
    }

    public abstract double foodPrice(ArrayList<Ingredients> ingredients);

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginality() {
        return originality;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}

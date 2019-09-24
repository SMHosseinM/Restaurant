package com.manchester.hossein.restaurantapi.domain.food;

import com.manchester.hossein.restaurantapi.domain.exception.InvalidBeverage;
import com.manchester.hossein.restaurantapi.domain.exception.InvalidDessert;

import java.util.ArrayList;
import java.util.UUID;

public class Curry extends Food {

    private Dessert selectedDessert;
    private Beverage selectedBeverage;

    public Curry(UUID id, String name, String originality) {
        super(id, name, originality);
    }

    public void addDessertForFood(UUID id){

        if(Dessert.getListOfAvailableDesserts().containsKey(id)){
            selectedDessert = Dessert.getListOfAvailableDesserts().get(id);
        } else {
            throw new InvalidDessert();
        }
    }

    public void addBeverageForFood(UUID id){

        if(Beverage.getListOfAllBeverages().containsKey(id)){
            selectedBeverage = Beverage.getListOfAllBeverages().get(id);
        }else {
            throw new InvalidBeverage();
        }
    }

    @Override
    public double foodPrice(ArrayList<Ingredients> ingredients) {
        double finalPrice = 0;

        finalPrice = ingredients.stream().mapToDouble(x -> x.getPrice()).sum();

        finalPrice += selectedDessert.getPrice() + selectedBeverage.getPrice();
        return finalPrice;
    }


}

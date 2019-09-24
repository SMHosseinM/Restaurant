package com.manchester.hossein.restaurantapi.domain.exception;

public class InvalidBeverage extends RuntimeException {
    public InvalidBeverage() {
        super("This beverage is not served by us.");
    }
}

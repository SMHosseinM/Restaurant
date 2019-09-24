package com.manchester.hossein.restaurantapi.domain.exception;

import java.util.UUID;

public class InvalidDessert extends RuntimeException {
    public InvalidDessert() {
        super("This dessert is not served by us.");
    }
}

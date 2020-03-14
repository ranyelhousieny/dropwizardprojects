package com.yammer.dropwizarddemo.resources;

import com.yammer.dropwizarddemo.com.yammer.dropwizarddemo.dto.Car;

import java.util.HashMap;
import java.util.Map;

public class Cars {
    private static Map<Integer, Car> cars;

    public Cars() {
        this.cars = new HashMap<>();
    }
}

package com.nidhalteyeb.devops.model;

public enum WeatherUnit {

    CELSIUS("t_2m:C");

    private String value;

    WeatherUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package com.nidhalteyeb.devops.service;

public class WeatherUrlFormatter {

    private static final String WEATHER_ENDPOINT = "https://api.meteomatics.com";

    private static final String SEPARATOR = "/";

    public String buildHttpUrl(final WeatherRequest request ){

        final StringBuilder builder = new StringBuilder(WEATHER_ENDPOINT);
        builder.append(SEPARATOR+request.getDateTime()+"Z");
        builder.append(SEPARATOR+request.getUnit().getValue());
        builder.append(SEPARATOR+request.latLng());
        builder.append(SEPARATOR+request.getFormat());

        return builder.toString();
    }



}

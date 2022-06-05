package com.nidhalteyeb.devops.service;

public class WeatherUrlFormatter {

    private static final String WEATHER_ENDPOINT = "https://api.openweathermap.org/data/2.5/weather?";

    private static final String SEPARATOR = "&";

    public String buildHttpUrl(final WeatherRequest request, String weatherApiKey){

        final StringBuilder builder = new StringBuilder(WEATHER_ENDPOINT);
        builder.append(SEPARATOR+ "lat=" +request.getLat())
                .append( SEPARATOR+ "lon=" +request.getLng());
        builder.append(SEPARATOR+"mode="+request.getFormat());
        builder.append(SEPARATOR+"appid="+weatherApiKey);
        //builder.append(SEPARATOR+request.getUnit().getValue());

        return builder.toString();
    }



}

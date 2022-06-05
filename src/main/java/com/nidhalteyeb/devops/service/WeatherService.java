package com.nidhalteyeb.devops.service;

import com.nidhalteyeb.devops.internal.http.HttpService;

import javax.enterprise.context.ApplicationScoped;
import java.net.http.HttpResponse;

@ApplicationScoped
public class WeatherService {

    private final HttpService httpService;

    private static final String WEATHER_API_KEY = "240aa650f4db4e154a07d0459c30a347";

    public WeatherService(){
        super();
        this.httpService = new HttpService();
    }

    public String calculateWeather(final WeatherRequest request){
        final HttpResponse<String> httpResponse = httpService.sendRequest(new WeatherUrlFormatter().buildHttpUrl(request, WEATHER_API_KEY) );
        return httpResponse.body();
    }

}

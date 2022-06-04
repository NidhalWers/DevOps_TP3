package com.nidhalteyeb.devops.service;

import com.nidhalteyeb.devops.internal.http.HttpService;

import javax.enterprise.context.ApplicationScoped;
import java.net.http.HttpResponse;

@ApplicationScoped
public class WeatherService {

    private final HttpService httpService;

    public WeatherService(){
        super();
        this.httpService = new HttpService();
    }

    public String calculateWeather(final WeatherRequest request){
        final HttpResponse<String> httpResponse = httpService.sendRequest(new WeatherUrlFormatter().buildHttpUrl(request));
        return httpResponse.body();
    }

}

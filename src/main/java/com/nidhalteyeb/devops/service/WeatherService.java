package com.nidhalteyeb.devops.service;

import com.nidhalteyeb.devops.internal.http.HttpService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.net.http.HttpResponse;

@ApplicationScoped
public class WeatherService {

    private final HttpService httpService;

    private String apiKey;

    public WeatherService(@ConfigProperty(name = "weather.api.key") String apiKey){
        super();
        this.httpService = new HttpService();
        this.apiKey=apiKey;
    }

    public String calculateWeather(final WeatherRequest request){
        final HttpResponse<String> httpResponse = httpService.sendRequest(new WeatherUrlFormatter().buildHttpUrl(request, apiKey) );
        return httpResponse.body();
    }

}

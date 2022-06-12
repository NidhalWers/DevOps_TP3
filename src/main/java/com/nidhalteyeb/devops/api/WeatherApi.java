package com.nidhalteyeb.devops.api;

import com.nidhalteyeb.devops.model.WeatherUnit;
import com.nidhalteyeb.devops.service.WeatherRequest;
import com.nidhalteyeb.devops.service.WeatherService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;

@Path("/weather")
public class WeatherApi {

    /**
     * weather api key : 240aa650f4db4e154a07d0459c30a347
     */

    @Inject
    WeatherService weatherService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeather(@QueryParam("lat") Double lat, @QueryParam("lon") Double lon) {
        //double lat = Double.parseDouble(System.getenv("LAT"));
        //double lng = Double.parseDouble(System.getenv("LONG"));
        WeatherRequest request = WeatherRequest.builder()
                .lat(lat)
                .lng(lon)
                .dateTime(LocalDateTime.now())
                .format("json")
                .unit(WeatherUnit.CELSIUS)
                .build();
        return weatherService.calculateWeather(request);
    }
}
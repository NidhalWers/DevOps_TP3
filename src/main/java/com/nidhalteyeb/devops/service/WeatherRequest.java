package com.nidhalteyeb.devops.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nidhalteyeb.devops.model.WeatherUnit;

import java.time.LocalDateTime;

public class WeatherRequest {

    private final Double lat;

    private final Double lng;

    @JsonProperty("date_time")
    private final LocalDateTime dateTime;

    private final String format;

    private final WeatherUnit unit;

    private WeatherRequest(Double lat, Double lng, LocalDateTime dateTime, String format, WeatherUnit unit) {
        this.lat = lat;
        this.lng = lng;
        this.dateTime = dateTime;
        this.format = format;
        this.unit = unit;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public String latLng(){
        return lat+","+lng;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getFormat() {
        return format;
    }

    public WeatherUnit getUnit() {
        return unit;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Double lat;

        private Double lng;

        private LocalDateTime dateTime;

        private String format;

        private WeatherUnit unit;

        public Builder lat(Double lat) {
            this.lat = lat;
            return this;
        }

        public Builder lng(Double lng) {
            this.lng = lng;
            return this;
        }

        public Builder dateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder format(String format) {
            this.format = format;
            return this;
        }

        public Builder unit(WeatherUnit unit) {
            this.unit = unit;
            return this;
        }

        public WeatherRequest build(){
            return new WeatherRequest(this.lat,
                    this.lng,
                    this.dateTime,
                    this.format,
                    this.unit);
        }
    }
}

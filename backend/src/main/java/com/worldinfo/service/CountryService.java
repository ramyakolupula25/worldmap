package com.worldinfo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Object getCountries() {

        String apiUrl =
                "https://restcountries.com/v3.1/all?fields=name,capital,population,region,flags";

        return restTemplate.getForObject(
                apiUrl,
                Object.class
        );
    }
}
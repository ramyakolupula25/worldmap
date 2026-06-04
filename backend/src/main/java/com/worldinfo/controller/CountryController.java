package com.worldinfo.controller;

import com.worldinfo.service.CountryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin(origins = "*")
public class CountryController {

    private final CountryService countryService;

    public CountryController(
            CountryService countryService) {

        this.countryService = countryService;
    }

    @GetMapping
    public Object getCountries() {

        return countryService.getCountries();
    }
}
package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final Map<String, Country> countryData = new HashMap<>();

    public CountryController() {
        countryData.put("IN", new Country("IN", "India", "New Delhi"));
        countryData.put("US", new Country("US", "United States", "Washington D.C."));
        countryData.put("FR", new Country("FR", "France", "Paris"));
    }


    @GetMapping
    public Collection<Country> getAllCountries() {
        return countryData.values();
    }


    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countryData.get(code.toUpperCase());
        if (country == null) {
            throw new RuntimeException("Country not found for code: " + code);
        }
        return country;
    }
}
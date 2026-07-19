package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final Map<String, Country> countryStore = new HashMap<>();

    public CountryController() {
        countryStore.put("IN", new Country("IN", "India", "New Delhi", "INR"));
        countryStore.put("US", new Country("US", "United States", "Washington D.C.", "USD"));
        countryStore.put("JP", new Country("JP", "Japan", "Tokyo", "JPY"));
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countryStore.get(code.toUpperCase());
        if (country == null) {
            throw new RuntimeException("Country not found for code: " + code);
        }
        return country;
    }
}
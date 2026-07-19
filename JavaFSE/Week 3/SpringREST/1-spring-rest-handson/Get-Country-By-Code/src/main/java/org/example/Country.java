package org.example;

public class Country {

    private String code;
    private String name;
    private String capital;
    private String currency;

    public Country() {}

    public Country(String code, String name, String capital, String currency) {
        this.code = code;
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public String getCapital() { return capital; }
    public String getCurrency() { return currency; }
}
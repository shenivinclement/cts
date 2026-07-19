package org.example;

public class Country {

    private String name;
    private String capital;
    private String currency;

    public void setName(String name) { this.name = name; }
    public void setCapital(String capital) { this.capital = capital; }
    public void setCurrency(String currency) { this.currency = currency; }

    @Override
    public String toString() {
        return "Country{name='" + name + "', capital='" + capital + "', currency='" + currency + "'}";
    }
}
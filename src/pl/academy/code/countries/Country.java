package pl.academy.code.countries;

public enum Country implements Continent {
    POLAND("PLN", 38000000, "Polski"),
    GERMANY("EUR", 70000000, "Deutsche"),
    FRANCE("EUR", 80000000, "Francis");

    private String currency;
    private long population;
    private String language;

    Country(String currency, long population, String language) {
        this.currency = currency;
        this.population = population;
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

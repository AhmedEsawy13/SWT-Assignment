package APICOUNTRY;

public class Country
{
    private String countryName;
    private int population;
    private int weather;
    

    public Country(String countryName, int population, int weather) {
        this.countryName = countryName;
        this.population = population;
        this.weather= weather;
    }

    public Country(Country toClone)
    {
        this.countryName = toClone.getCountryName();
        this.population = toClone.getPopulation();
        this.weather= toClone.getweather();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getweather() {
        return weather;
    }

    public void setweather(int weather) {
        this.weather = weather;
    }
}
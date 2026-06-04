package com.worldinfo.dto;

public class CountryDto {

    private String name;
    private String capital;
    private String region;
    private Long population;
    private String flag;

    public CountryDto() {
    }

    public CountryDto(
            String name,
            String capital,
            String region,
            Long population,
            String flag) {

        this.name = name;
        this.capital = capital;
        this.region = region;
        this.population = population;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
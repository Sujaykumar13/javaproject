package dto;

public class CountryDto {

    private String countryName;
    private int countryCode;
    private long population;
    private String presidentName;

    public CountryDto() {
    }

    public CountryDto(String countryName, int countryCode, long population,String presidentName) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
        this.presidentName=presidentName;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "countryName='" + countryName + '\'' +
                ", countryCode=" + countryCode +
                ", population=" + population +
                ", presidentName='" + presidentName + '\'' +
                '}';
    }
}

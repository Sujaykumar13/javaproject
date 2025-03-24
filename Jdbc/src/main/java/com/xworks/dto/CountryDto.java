package com.xworks.dto;

import java.io.Serializable;

public class CountryDto implements Serializable {


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

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }

        public String getPresidentName() {
            return presidentName;
        }

        public void setPresidentName(String presidentName) {
            this.presidentName = presidentName;
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



package com.xworks.dto;

import java.io.Serializable;

public class CricketOdiStatsDto implements Serializable,Comparable{

    private int odiRuns;
    private int noOfFifties;
    private int noOfHundreds;
    private double average;

    public CricketOdiStatsDto() {
    }

    public CricketOdiStatsDto(int odiRuns, int noOfFifties, int noOfHundreds, double average) {
        this.odiRuns = odiRuns;
        this.noOfFifties = noOfFifties;
        this.noOfHundreds = noOfHundreds;
        this.average = average;
    }

    public int getOdiRuns() {
        return odiRuns;
    }

    public void setOdiRuns(int odiRuns) {
        this.odiRuns = odiRuns;
    }

    public int getNoOfFifties() {
        return noOfFifties;
    }

    public void setNoOfFifties(int noOfFifties) {
        this.noOfFifties = noOfFifties;
    }

    public int getNoOfHundreds() {
        return noOfHundreds;
    }

    public void setNoOfHundreds(int noOfHundreds) {
        this.noOfHundreds = noOfHundreds;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

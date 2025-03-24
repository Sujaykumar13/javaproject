package com.xworks.dto;

import java.io.Serializable;

public class CricketTeamDto implements Serializable ,Comparable {

    private int jerrseyNum;
    private String playerName;
    private String playerType;
    private String birthPlace;
    private String birthDate;
    private int matches;
    private int testRuns;

    public CricketTeamDto() {
    }

    public CricketTeamDto(int jerrseyNum, String playerName, String playerType, String birthPlace, String birthDate, int matches, int testRuns) {
        this.jerrseyNum = jerrseyNum;
        this.playerName = playerName;
        this.playerType = playerType;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.matches = matches;
        this.testRuns = testRuns;
    }

    public int getJerrseyNum() {
        return jerrseyNum;
    }

    public void setJerrseyNum(int jerrseyNum) {
        this.jerrseyNum = jerrseyNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getTestRuns() {
        return testRuns;
    }

    public void setTestRuns(int testRuns) {
        this.testRuns = testRuns;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

package com.xworks.dao;

import com.xworks.dto.CricketTeamDto;

import java.util.List;

public interface CricketTeamDao {

    CricketTeamDto savePlayer(CricketTeamDto cricketTeamDto);

    int getPlayerByJerseyNum(int jerseyNum);

    int getPlayerTypeByJerseyNum(int jerseyNum);

    void updatePlayer(CricketTeamDto cricketTeamDto,int jerseyNum);

    void deletePlayer(int jerseyNum);

    void getPlayerNames();

    List<Object> getAllPlayerNameAndPlayerType();

    void getAllPlayerNameAndPlayerTypeByJerseyNum(int jerseyNum);


}


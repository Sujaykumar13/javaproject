package com.xworks.jpa;

import com.xworks.dto.CricketTeamDto;
import com.xworks.servicelayer.ServiceImplementation;

public class CricketDaoRunner {
    public static void main(String[] args) {

         ServiceImplementation service=new ServiceImplementation();

//        //Collection<CricketTeamDto> teamDtos = CricketTeamRunner.getPlayers();
//        CricketTeamDto playerdto=new CricketTeamDto(142,"sujaykumar","batting","bangalore","1998/02/14",255,8554);
//        service.savePlayer(playerdto);

        System.out.println("-------------------------------------------------------------");

        service.getPlayerByJerseyNum(1);

        System.out.println("-------------------------------------------------------------");


        service.getPlayerTypeByJerseyNum(1);

        System.out.println("-------------------------------------------------------------");

        service.getAllPlayerNameAndPlayerType();

        System.out.println("-------------------------------------------------------------");

        service.getPlayerNames();

        System.out.println("-------------------------------------------------------------");

        service.getAllPlayerNameAndPlayerTypeByJerseyNum(1);

        System.out.println("-------------------------------------------------------------");

        //service.deletePlayer(88);

        System.out.println("-------------------------------------------------------------");

        CricketTeamDto dto = new CricketTeamDto();

        service.updatePlayer(dto ,122);


    }
}

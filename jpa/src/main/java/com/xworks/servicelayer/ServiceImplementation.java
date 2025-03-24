package com.xworks.servicelayer;

import com.xworks.dao.CricketTeamDao;
import com.xworks.dao.CricketTeamDaoImplimentation;
import com.xworks.dto.CricketTeamDto;

import java.util.Collections;
import java.util.List;
//Servicelayer/busieess layer

public class ServiceImplementation implements com.xworks.servicelayer.Service {

    CricketTeamDao cricketTeamDaoImplimentation= new CricketTeamDaoImplimentation();
    @Override
    public CricketTeamDto savePlayer(CricketTeamDto cricketTeamDto) {
//        if(cricketTeamDto!=null && cricketTeamDto.getJerseyNum()>0&& cricketTeamDto.getPlayer_name()!=null&&
//                cricketTeamDto.getPlayer_type()!=null&&cricketTeamDto.getBirth_date()!=null&&
//                cricketTeamDto.getBirth_place()!=null&&cricketTeamDto.getMatches()>0&&cricketTeamDto.getTest_runs()>0)
//        {
//            return cricketTeamDaoImplimentation.savePlayer(cricketTeamDto);
//        }
        if(cricketTeamDto!=null){
            boolean flag=false;
            if(cricketTeamDto.getJerseyNum()<=0)
            {
                System.out.println("jersey number is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getMatches()<=0)
            {
                System.out.println("matches is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getTest_runs()<=0)
            {
                System.out.println("Testruns is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getPlayer_name()==null)
            {
                System.out.println("playername is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getPlayer_name()=="" && cricketTeamDto.getPlayer_name().isEmpty())
            {
                System.out.println("playername is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getPlayer_type()==null)
            {
                System.out.println("playertype is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getPlayer_type()=="" && cricketTeamDto.getPlayer_type().isEmpty())
            {
                System.out.println("playertype is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getBirth_place()==null)
            {
                System.out.println("birthpalce is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getBirth_place()=="" && cricketTeamDto.getBirth_place().isEmpty())
            {
                System.out.println("birthplace is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getBirth_date()==null)
            {
                System.out.println("birthdate is not correct");
                flag=true;
            }
            else if(cricketTeamDto.getBirth_date()=="" && cricketTeamDto.getBirth_date().isEmpty())
            {
                System.out.println("birthdate is not correct");
                flag=true;
            }
            if(flag==false)
            {
                return cricketTeamDaoImplimentation.savePlayer(cricketTeamDto);
            }
        }
        System.out.println("Value's are not correct");
        return null;
    }

    @Override
    public int getPlayerByJerseyNum(int jerseyNum) {
        if(jerseyNum>0)
        {
            System.out.println("jersey number is correct");
            return cricketTeamDaoImplimentation.getPlayerByJerseyNum(jerseyNum);
        }
        else
        {
            System.out.println("value is not correct");
        }
        return 0;
    }

    @Override
    public int getPlayerTypeByJerseyNum(int jerseyNum) {
        if(jerseyNum>0)
        {
            System.out.println("jersey number is correct");
            return cricketTeamDaoImplimentation.getPlayerTypeByJerseyNum(jerseyNum);
        }
        else
        {
            System.out.println("value is not correct");
        }
        return 0;
    }

    @Override
    public void updatePlayer(CricketTeamDto cricketTeamDto, int jerseyNum) {
        if(jerseyNum>0)
        {
            System.out.println("jersey number is correct");
             cricketTeamDaoImplimentation.updatePlayer(cricketTeamDto,jerseyNum);
        }
        else
        {
            System.out.println("value is not correct");
        }

    }

    @Override
    public void deletePlayer(int jerseyNum) {
        if(jerseyNum>0)
        {
            System.out.println("jersey number is correct");
            cricketTeamDaoImplimentation.deletePlayer(jerseyNum);
        }
        else
        {
            System.out.println("value is not correct");
        }

    }

    @Override
    public void getPlayerNames() {
        cricketTeamDaoImplimentation.getPlayerNames();

    }

    @Override
    public List<Object> getAllPlayerNameAndPlayerType() {
        cricketTeamDaoImplimentation.getAllPlayerNameAndPlayerType();
        return Collections.emptyList();
    }

    @Override
    public void getAllPlayerNameAndPlayerTypeByJerseyNum(int jerseyNum) {
        if(jerseyNum>0)
        {
            System.out.println("jersey number is correct");
            cricketTeamDaoImplimentation.getAllPlayerNameAndPlayerTypeByJerseyNum(jerseyNum);
        }
        else
        {
            System.out.println("value is not correct");
        }

    }
}

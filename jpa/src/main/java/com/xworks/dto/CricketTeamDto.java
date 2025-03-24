package com.xworks.dto;

import javax.persistence.*;

@Entity
@Table(name = "my_player_info")
@NamedQuery(name="query1",query="select c from CricketTeamDto c")
@NamedQuery(name="query2",query="select count(*) from CricketTeamDto c")
@NamedQuery(name="query3",query="select c from CricketTeamDto c where player_name like '__r%'")
@NamedQuery(name="query4",query="select avg(test_runs) from CricketTeamDto")
@NamedQuery(name="query5",query="select sum(test_runs) from CricketTeamDto")
@NamedQuery(name="query6",query="select min(test_runs) from CricketTeamDto")
@NamedQuery(name="query7",query="select max(test_runs) from CricketTeamDto")
@NamedQuery(name="query8",query="select c from CricketTeamDto c where test_runs between 3000 and 9000")
@NamedQuery(name="sqlQuery1",query="delete from my_player_info where player_name='viratkohli'")
@NamedQuery(name="sqlQuery2",query="insert into my_player_info values(18, 'viratkohli', 'batter','delhi','1988-11-06',119,9012)")
@NamedQuery(name="sqlQuery3",query="update my_player_info set jersey_Num=3 where player_name='suresh'")
//@NamedQuery(name="query9",query="select c from CricketTeamDto c where player_name:name")
//@NamedQuery(name="query10",query="select player_type from CricketTeamDto group by player_type")

public class CricketTeamDto {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jersey_num")//whenever column name in database and java different
    private int jersey_Num;
    private String player_name;
    private String player_type;
    private String birth_place;
    private String birth_date;
    private int matches;
    private int test_runs;

    public CricketTeamDto() {
    }

    public CricketTeamDto(int jerseyNum, String player_name, String player_type, String birth_place, String birth_date, int matches, int test_runs) {
        this.jersey_Num = jerseyNum;
        this.player_name = player_name;
        this.player_type = player_type;
        this.birth_place = birth_place;
        this.birth_date = birth_date;
        this.matches = matches;
        this.test_runs = test_runs;
    }

    public int getJerseyNum() {
        return jersey_Num;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jersey_Num = jerseyNum;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_type() {
        return player_type;
    }

    public void setPlayer_type(String player_type) {
        this.player_type = player_type;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getTest_runs() {
        return test_runs;
    }

    public void setTest_runs(int test_runs) {
        this.test_runs = test_runs;
    }
}

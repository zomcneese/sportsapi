package com.sportsdata.tracker.player;

import com.sportsdata.tracker.team.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, String> {

    // finder methods or query methods
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
    public List<Player> findByNumber(String number);

    public List<Player> findByNameIgnoreCaseContaining(String name);

    // Find a collection of players by Player.team.name where Player.team.name contains (name)
    public List<Player> findByTeamNameIgnoreCaseContaining(String name);

    public List<Player> findByTeamCityIgnoreCaseContaining(String city);

    public List<Player> findByTeamStateIgnoreCaseContaining(String state);

}

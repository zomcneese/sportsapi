package com.sportsdata.tracker.team;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, String> {


    // finder methods or query methods
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
    public List<Player> findByRosterId(String playerId);

//    public List<Team> findByCityIgnoreCaseContaining(String city);
//    public List<Team> findByStateIgnoreCaseContaining(String state);

}

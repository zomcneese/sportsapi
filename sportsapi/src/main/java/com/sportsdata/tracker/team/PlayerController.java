package com.sportsdata.tracker.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "rosterId")
public class PlayerController {

    @Autowired
    TeamRepository playerRepository;

    // http://localhost:8080/team/teamName?teamName=Falc
    @RequestMapping(method = RequestMethod.GET, path = "/rosterId")
    public List<Player> findByRosterId(@RequestParam(name="rosterId") String rosterId){
        return playerRepository.findByRosterId(rosterId);
    }


}

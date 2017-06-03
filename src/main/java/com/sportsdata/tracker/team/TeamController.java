package com.sportsdata.tracker.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "team")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    // http://localhost:8080/team/teamName?teamName=Falc
    @RequestMapping(method = RequestMethod.GET, path = "/teamName")
    public List<Team> findByTeamNameIgnoreCaseContaining(@RequestParam(name="teamName") String teamName){
        return teamRepository.findByTeamNameIgnoreCaseContaining(teamName);
    }


}

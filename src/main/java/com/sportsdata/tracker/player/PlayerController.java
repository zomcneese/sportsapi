package com.sportsdata.tracker.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "player")
public class PlayerController {


    @Autowired
    PlayerRepository playerRepository;

    // http://localhost:8080/player/number?number=11
    @RequestMapping(method = RequestMethod.GET, path = "/number")
    public List<Player> findByNumber(@RequestParam(name="number") String number){
        return playerRepository.findByNumber(number);
    }

    // http://localhost:8080/player/name?name=dave
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public List<Player> findByNameIgnoreCaseContaining(@RequestParam(name="name") String name){
        return playerRepository.findByNameIgnoreCaseContaining(name);
    }

    // http://localhost:8080/player/team/name?name=alpha
    @RequestMapping(method = RequestMethod.GET, path = "/team/name")
    public List<Player> findByTeamNameIgnoreCaseContaining(@RequestParam(name="name") String name){
        return playerRepository.findByTeamNameIgnoreCaseContaining(name);
    }

    // http://localhost:8080/player/team/city?city=seaside
    @RequestMapping(method = RequestMethod.GET, path = "/team/city")
    public List<Player> findByTeamCityIgnoreCaseContaining(@RequestParam(name="city") String city){
        return playerRepository.findByTeamCityIgnoreCaseContaining(city);
    }

    // http://localhost:8080/player/team/state?state=texas
    @RequestMapping(method = RequestMethod.GET, path = "/team/state")
    public List<Player> findByTeamStateIgnoreCaseContaining(@RequestParam(name="state") String state){
        return playerRepository.findByTeamStateIgnoreCaseContaining(state);
    }


    // get a player, use that info to make an update
    /*
    curl -X GET \
        'http://localhost:8080/player/name?name=antonio'

    Response:
    {
    "id": "592ba89c7511962b648db8aa",
    "number": "38",
    "name": "Antonio Calculon Sr.",
    "performanceScore": 2,
    "team": {
      "id": "592ba89c7511962b648db8a5",
      "name": "Foxtrot Fliers",
      "city": "Galveston",
      "state": "Texas"
    }


    using the response above, modify the json, and make an update
    curl -X POST \
        http://localhost:8080/player/update \
        -H 'content-type: application/json' \
        -d '{
            "id": "592ba89c7511962b648db8aa",
            "number": "38",
            "name": "Antonio Calculon Jr. 2",
            "performanceScore": 2,
            "team": {
                "id": "592ba89c7511962b648db8a5",
                "name": "Foxtrot Fliers",
                "city": "Galveston",
                "state": "Texas"
                }
            }'

    */

    @RequestMapping(method = RequestMethod.POST, path = "/update")
    public void updatePlayer(@RequestBody Player player){

        // if an object in the database already contains
        // an id that matches incoming player.id (objectId),
        // the object in the database will get updated
        // if there is no object that exists in the database,
        // the object will get inserted
        playerRepository.save(player);
    }


    // get a player, use that info to delete the given player
    /*
    curl -X GET \
        'http://localhost:8080/player/name?name=antonio'

    Response:
    {
    "id": "592ba89c7511962b648db8aa",
    "number": "38",
    "name": "Antonio Calculon Sr.",
    "performanceScore": 2,
    "team": {
      "id": "592ba89c7511962b648db8a5",
      "name": "Foxtrot Fliers",
      "city": "Galveston",
      "state": "Texas"
    }

    delete the player that was given in the response
    curl -X DELETE \
        http://localhost:8080/player/delete \
        -H 'content-type: application/json' \
        -d '{
            "id": "592ba99275119614dc2292b5",
            "number": "38",
            "name": "Antonio Calculon Sr. 2",
            "performanceScore": 2,
            "team": {
                "id": "592ba99275119614dc2292b0",
                "name": "Foxtrot Fliers",
                "city": "Galveston",
                "state": "Texas"
                }
            }'

    */
    @RequestMapping(method = RequestMethod.DELETE, path="/delete")
    public void deletePlayer(@RequestBody Player player){
        playerRepository.delete(player);
    }

}

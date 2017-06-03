package com.sportsdata.tracker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdata.tracker.team.Roster;
import com.sportsdata.tracker.team.RosterDeserializer;
import com.sportsdata.tracker.team.Team;
import com.sportsdata.tracker.team.TeamRepository;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@SpringBootApplication
public class SportsApiApplication implements CommandLineRunner{

    @Autowired
    TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(SportsApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Get file from resources folder
        String fileName = "teams-fts.json";
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        String result = null;
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Create the gson object (String json to Java object converter)
        GsonBuilder b = new GsonBuilder();
        b.registerTypeAdapter(Roster.class, new RosterDeserializer());
        Gson gson = b.create();

        // Start handling the firebase json object
        JSONObject mainObject = new JSONObject(result);

        // foreach team in teams
        Iterator<?> keys = mainObject.keys();
        while( keys.hasNext() ) {
            String key = (String)keys.next();
            if ( mainObject.get(key) instanceof JSONObject ) {
                // get the team json
                JSONObject teamJson = mainObject.getJSONObject(key);
                // create the team java object from the team json
                Team team = gson.fromJson(teamJson.toString(),Team.class);
                // save the team object to the database
                teamRepository.save(team);
            }
        }

        //  The entire document is in the database - hizzah!
        System.out.println("Completed loading data");

    }


}

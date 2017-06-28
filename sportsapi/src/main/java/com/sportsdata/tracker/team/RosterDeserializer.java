package com.sportsdata.tracker.team;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class RosterDeserializer implements JsonDeserializer<Roster> {


    @Override
    public Roster deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Roster roster = new Roster();
        Gson gson = new Gson();
        Set<Map.Entry<String, JsonElement>> entrySet = ((JsonObject)json).entrySet();
        for(Map.Entry<String,JsonElement> entry : entrySet){

            Player player = gson.fromJson(entry.getValue(),Player.class);
            roster.getPlayers().add(player);

            System.out.println("Test");
        }
        return roster;
    }
}

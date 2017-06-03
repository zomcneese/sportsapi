package com.sportsdata.tracker.team;

import java.util.ArrayList;

public class Roster {

    ArrayList<Player> players;

    public Roster (){
        players = new ArrayList<Player>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}

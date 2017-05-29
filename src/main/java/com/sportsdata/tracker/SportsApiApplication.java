package com.sportsdata.tracker;


import com.sportsdata.tracker.player.Player;
import com.sportsdata.tracker.player.PlayerRepository;
import com.sportsdata.tracker.team.Team;
import com.sportsdata.tracker.team.TeamRepository;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportsApiApplication implements CommandLineRunner{


    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PlayerRepository playerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SportsApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Team alpha = new Team();
        alpha.setName("Alpha Alliance");
        alpha.setCity("Seaside");
        alpha.setState("California");

        Team sierra = new Team();
        sierra.setName("Sierra Sentinels");
        sierra.setCity("Silver Spring");
        sierra.setState("Maryland");

        Team foxtrot = new Team();
        foxtrot.setName("Foxtrot Fliers");
        foxtrot.setCity("Galveston");
        foxtrot.setState("Texas");

        teamRepository.save(alpha);
        teamRepository.save(sierra);
        teamRepository.save(foxtrot);

        Player alphaTed = new Player();
        alphaTed.setName("Dave Anderson");
        alphaTed.setNumber("20");
        alphaTed.setPerformanceScore(2.5d);
        alphaTed.setTeam(alpha);

        Player alphaJohn = new Player();
        alphaJohn.setName("John Shepard");
        alphaJohn.setNumber("30");
        alphaJohn.setPerformanceScore(3.0d);
        alphaJohn.setTeam(alpha);

        Player sierraSteve = new Player();
        sierraSteve.setName("Steve Polychronopolous");
        sierraSteve.setNumber("11");
        sierraSteve.setPerformanceScore(1.0d);
        sierraSteve.setTeam(sierra);

        Player sierraJane = new Player();
        sierraJane.setName("Jane Doe");
        sierraJane.setNumber("13");
        sierraJane.setPerformanceScore(3.9d);
        sierraJane.setTeam(sierra);

        Player foxtrotMelida = new Player();
        foxtrotMelida.setName("Melinda Thomas");
        foxtrotMelida.setNumber("29");
        foxtrotMelida.setPerformanceScore(3.7d);
        foxtrotMelida.setTeam(foxtrot);

        Player foxtrotAntonio = new Player();
        foxtrotAntonio.setName("Antonio Calculon Sr.");
        foxtrotAntonio.setNumber("38");
        foxtrotAntonio.setPerformanceScore(2.0d);
        foxtrotAntonio.setTeam(foxtrot);

        playerRepository.save(alphaJohn);
        playerRepository.save(alphaTed);
        playerRepository.save(sierraJane);
        playerRepository.save(sierraSteve);
        playerRepository.save(foxtrotAntonio);
        playerRepository.save(foxtrotMelida);


        System.out.println("Completed loading data");




    }
}

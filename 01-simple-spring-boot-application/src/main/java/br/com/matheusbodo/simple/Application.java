package br.com.matheusbodo.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.matheusbodo.simple.model.Player;
import br.com.matheusbodo.simple.model.Team;
import br.com.matheusbodo.simple.repository.TeamRepository;

@SpringBootApplication
public class Application {

	@Autowired
	private TeamRepository teamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();
		
		Player tomBrady = new Player("Tom Brady", "Quarterback");
		Set<Player> nePlayers = new HashSet<>();
		nePlayers.add(tomBrady);

		Team team = new Team("New England", "Patriots", nePlayers);
		list.add(team);

		Player aaronRodgers = new Player("Aaron Rodgers", "Quarterback");
		Set<Player> gbPlayers = new HashSet<>();
		gbPlayers.add(aaronRodgers);
		
		team = new Team("Green Bay", "Packers", gbPlayers);
		list.add(team);

		teamRepository.save(list);
	}
}

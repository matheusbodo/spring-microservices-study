package br.com.matheusbodo.simple;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		Team team = new Team();
		team.setLocation("New England");
		team.setName("Patriots");
		list.add(team);

		team = new Team();
		team.setLocation("Green Bay");
		team.setName("Packers");
		list.add(team);

		teamRepository.save(list);
	}
}

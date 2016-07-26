package br.com.matheusbodo.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheusbodo.simple.model.Team;

@RestController
public class TeamController {

	@RequestMapping("/teams")
	public List<Team> getTeams() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setId(1l);
		team.setLocation("New England");
		team.setName("Patriots");
		list.add(team);

		team = new Team();
		team.setId(2l);
		team.setLocation("Green Bay");
		team.setName("Packers");
		list.add(team);

		return list;
	}
}

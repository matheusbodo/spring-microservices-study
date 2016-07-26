package br.com.matheusbodo.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheusbodo.simple.model.Team;
import br.com.matheusbodo.simple.repository.TeamRepository;

@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
}

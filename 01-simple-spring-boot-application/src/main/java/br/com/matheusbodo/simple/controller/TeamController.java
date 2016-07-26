package br.com.matheusbodo.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.matheusbodo.simple.model.Team;
import br.com.matheusbodo.simple.repository.TeamRepository;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable(value="id") Long id) {
		return teamRepository.findOne(id);
	}
}

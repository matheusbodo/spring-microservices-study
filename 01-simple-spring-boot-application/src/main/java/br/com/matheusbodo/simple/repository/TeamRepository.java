package br.com.matheusbodo.simple.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.matheusbodo.simple.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}

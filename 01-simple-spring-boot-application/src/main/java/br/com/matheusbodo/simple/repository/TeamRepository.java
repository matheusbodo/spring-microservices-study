package br.com.matheusbodo.simple.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.matheusbodo.simple.model.Team;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long>{

}

package br.com.matheusbodo.simple.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.matheusbodo.simple.model.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}

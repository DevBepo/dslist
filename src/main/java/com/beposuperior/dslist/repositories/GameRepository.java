package com.beposuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beposuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {
	
}
